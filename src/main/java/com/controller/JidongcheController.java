
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 机动车业务
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jidongche")
public class JidongcheController {
    private static final Logger logger = LoggerFactory.getLogger(JidongcheController.class);

    @Autowired
    private JidongcheService jidongcheService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = jidongcheService.queryPage(params);

        //字典表数据转换
        List<JidongcheView> list =(List<JidongcheView>)page.getList();
        for(JidongcheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JidongcheEntity jidongche = jidongcheService.selectById(id);
        if(jidongche !=null){
            //entity转view
            JidongcheView view = new JidongcheView();
            BeanUtils.copyProperties( jidongche , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(jidongche.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JidongcheEntity jidongche, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jidongche:{}",this.getClass().getName(),jidongche.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            jidongche.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JidongcheEntity> queryWrapper = new EntityWrapper<JidongcheEntity>()
            .eq("jidongche_name", jidongche.getJidongcheName())
            .eq("jidongche_types", jidongche.getJidongcheTypes())
            .eq("yonghu_id", jidongche.getYonghuId())
            .eq("jidongche_yesno_types", jidongche.getJidongcheYesnoTypes())
            .eq("jidongche_yesno_text", jidongche.getJidongcheYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JidongcheEntity jidongcheEntity = jidongcheService.selectOne(queryWrapper);
        if(jidongcheEntity==null){
            jidongche.setJidongcheYesnoTypes(1);
            jidongche.setCreateTime(new Date());
            jidongcheService.insert(jidongche);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JidongcheEntity jidongche, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jidongche:{}",this.getClass().getName(),jidongche.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            jidongche.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JidongcheEntity> queryWrapper = new EntityWrapper<JidongcheEntity>()
            .notIn("id",jidongche.getId())
            .andNew()
            .eq("jidongche_name", jidongche.getJidongcheName())
            .eq("jidongche_types", jidongche.getJidongcheTypes())
            .eq("jidongche_time", jidongche.getJidongcheTime())
            .eq("yonghu_id", jidongche.getYonghuId())
            .eq("jidongche_yesno_types", jidongche.getJidongcheYesnoTypes())
            .eq("jidongche_yesno_text", jidongche.getJidongcheYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JidongcheEntity jidongcheEntity = jidongcheService.selectOne(queryWrapper);
        if(jidongcheEntity==null){
            jidongcheService.updateById(jidongche);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody JidongcheEntity jidongcheEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,jidongcheEntity:{}",this.getClass().getName(),jidongcheEntity.toString());

//        if(jidongcheEntity.getJidongcheYesnoTypes() == 2){//通过
//            jidongcheEntity.setJidongcheTypes();
//        }else if(jidongcheEntity.getJidongcheYesnoTypes() == 3){//拒绝
//            jidongcheEntity.setJidongcheTypes();
//        }
        jidongcheService.updateById(jidongcheEntity);//审核
        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jidongcheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JidongcheEntity> jidongcheList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JidongcheEntity jidongcheEntity = new JidongcheEntity();
//                            jidongcheEntity.setJidongcheName(data.get(0));                    //标题 要改的
//                            jidongcheEntity.setJidongcheTypes(Integer.valueOf(data.get(0)));   //机动车业务类型 要改的
//                            jidongcheEntity.setJidongcheTime(sdf.parse(data.get(0)));          //申请时间 要改的
//                            jidongcheEntity.setYonghuId(Integer.valueOf(data.get(0)));   //申请用户 要改的
//                            jidongcheEntity.setJidongcheContent("");//详情和图片
//                            jidongcheEntity.setJidongcheYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            jidongcheEntity.setJidongcheYesnoText(data.get(0));                    //申请结果 要改的
//                            jidongcheEntity.setCreateTime(date);//时间
                            jidongcheList.add(jidongcheEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jidongcheService.insertBatch(jidongcheList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
