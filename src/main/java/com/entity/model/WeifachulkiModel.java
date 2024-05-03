package com.entity.model;

import com.entity.WeifachulkiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 违法处理业务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WeifachulkiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String weifachulkiName;


    /**
     * 违法处理业务类型
     */
    private Integer weifachulkiTypes;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date weifachulkiTime;


    /**
     * 内容
     */
    private String weifachulkiVideo;


    /**
     * 内容
     */
    private Double weifachulkiMoney;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 详情
     */
    private String weifachulkiContent;


    /**
     * 业务状态
     */
    private Integer weifachulkiStatusTypes;


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
    public String getWeifachulkiName() {
        return weifachulkiName;
    }


    /**
	 * 设置：标题
	 */
    public void setWeifachulkiName(String weifachulkiName) {
        this.weifachulkiName = weifachulkiName;
    }
    /**
	 * 获取：违法处理业务类型
	 */
    public Integer getWeifachulkiTypes() {
        return weifachulkiTypes;
    }


    /**
	 * 设置：违法处理业务类型
	 */
    public void setWeifachulkiTypes(Integer weifachulkiTypes) {
        this.weifachulkiTypes = weifachulkiTypes;
    }
    /**
	 * 获取：时间
	 */
    public Date getWeifachulkiTime() {
        return weifachulkiTime;
    }


    /**
	 * 设置：时间
	 */
    public void setWeifachulkiTime(Date weifachulkiTime) {
        this.weifachulkiTime = weifachulkiTime;
    }
    /**
	 * 获取：内容
	 */
    public String getWeifachulkiVideo() {
        return weifachulkiVideo;
    }


    /**
	 * 设置：内容
	 */
    public void setWeifachulkiVideo(String weifachulkiVideo) {
        this.weifachulkiVideo = weifachulkiVideo;
    }
    /**
	 * 获取：内容
	 */
    public Double getWeifachulkiMoney() {
        return weifachulkiMoney;
    }


    /**
	 * 设置：内容
	 */
    public void setWeifachulkiMoney(Double weifachulkiMoney) {
        this.weifachulkiMoney = weifachulkiMoney;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：详情
	 */
    public String getWeifachulkiContent() {
        return weifachulkiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setWeifachulkiContent(String weifachulkiContent) {
        this.weifachulkiContent = weifachulkiContent;
    }
    /**
	 * 获取：业务状态
	 */
    public Integer getWeifachulkiStatusTypes() {
        return weifachulkiStatusTypes;
    }


    /**
	 * 设置：业务状态
	 */
    public void setWeifachulkiStatusTypes(Integer weifachulkiStatusTypes) {
        this.weifachulkiStatusTypes = weifachulkiStatusTypes;
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
