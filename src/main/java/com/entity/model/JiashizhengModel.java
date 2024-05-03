package com.entity.model;

import com.entity.JiashizhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 驾驶证业务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiashizhengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String jiashizhengName;


    /**
     * 驾驶证业务类型
     */
    private Integer jiashizhengTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiashizhengTime;


    /**
     * 相关文件
     */
    private String jiashizhengFile;


    /**
     * 申请用户
     */
    private Integer yonghuId;


    /**
     * 详情
     */
    private String jiashizhengContent;


    /**
     * 申请状态
     */
    private Integer jiashizhengYesnoTypes;


    /**
     * 申请结果
     */
    private String jiashizhengYesnoText;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getJiashizhengName() {
        return jiashizhengName;
    }


    /**
	 * 设置：标题
	 */
    public void setJiashizhengName(String jiashizhengName) {
        this.jiashizhengName = jiashizhengName;
    }
    /**
	 * 获取：驾驶证业务类型
	 */
    public Integer getJiashizhengTypes() {
        return jiashizhengTypes;
    }


    /**
	 * 设置：驾驶证业务类型
	 */
    public void setJiashizhengTypes(Integer jiashizhengTypes) {
        this.jiashizhengTypes = jiashizhengTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getJiashizhengTime() {
        return jiashizhengTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setJiashizhengTime(Date jiashizhengTime) {
        this.jiashizhengTime = jiashizhengTime;
    }
    /**
	 * 获取：相关文件
	 */
    public String getJiashizhengFile() {
        return jiashizhengFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setJiashizhengFile(String jiashizhengFile) {
        this.jiashizhengFile = jiashizhengFile;
    }
    /**
	 * 获取：申请用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：申请用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：详情
	 */
    public String getJiashizhengContent() {
        return jiashizhengContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJiashizhengContent(String jiashizhengContent) {
        this.jiashizhengContent = jiashizhengContent;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getJiashizhengYesnoTypes() {
        return jiashizhengYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setJiashizhengYesnoTypes(Integer jiashizhengYesnoTypes) {
        this.jiashizhengYesnoTypes = jiashizhengYesnoTypes;
    }
    /**
	 * 获取：申请结果
	 */
    public String getJiashizhengYesnoText() {
        return jiashizhengYesnoText;
    }


    /**
	 * 设置：申请结果
	 */
    public void setJiashizhengYesnoText(String jiashizhengYesnoText) {
        this.jiashizhengYesnoText = jiashizhengYesnoText;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
