package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.JiashizhengDao;
import com.entity.JiashizhengEntity;
import com.service.JiashizhengService;
import com.entity.view.JiashizhengView;

/**
 * 驾驶证业务 服务实现类
 */
@Service("jiashizhengService")
@Transactional
public class JiashizhengServiceImpl extends ServiceImpl<JiashizhengDao, JiashizhengEntity> implements JiashizhengService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiashizhengView> page =new Query<JiashizhengView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
