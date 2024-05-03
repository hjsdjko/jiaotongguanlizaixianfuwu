package com.entity.vo;

import com.entity.WeifachulkiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 违法处理业务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("weifachulki")
public class WeifachulkiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "weifachulki_name")
    private String weifachulkiName;


    /**
     * 违法处理业务类型
     */

    @TableField(value = "weifachulki_types")
    private Integer weifachulkiTypes;


    /**
     * 时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "weifachulki_time")
    private Date weifachulkiTime;


    /**
     * 内容
     */

    @TableField(value = "weifachulki_video")
    private String weifachulkiVideo;


    /**
     * 内容
     */

    @TableField(value = "weifachulki_money")
    private Double weifachulkiMoney;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 详情
     */

    @TableField(value = "weifachulki_content")
    private String weifachulkiContent;


    /**
     * 业务状态
     */

    @TableField(value = "weifachulki_status_types")
    private Integer weifachulkiStatusTypes;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getWeifachulkiName() {
        return weifachulkiName;
    }


    /**
	 * 获取：标题
	 */

    public void setWeifachulkiName(String weifachulkiName) {
        this.weifachulkiName = weifachulkiName;
    }
    /**
	 * 设置：违法处理业务类型
	 */
    public Integer getWeifachulkiTypes() {
        return weifachulkiTypes;
    }


    /**
	 * 获取：违法处理业务类型
	 */

    public void setWeifachulkiTypes(Integer weifachulkiTypes) {
        this.weifachulkiTypes = weifachulkiTypes;
    }
    /**
	 * 设置：时间
	 */
    public Date getWeifachulkiTime() {
        return weifachulkiTime;
    }


    /**
	 * 获取：时间
	 */

    public void setWeifachulkiTime(Date weifachulkiTime) {
        this.weifachulkiTime = weifachulkiTime;
    }
    /**
	 * 设置：内容
	 */
    public String getWeifachulkiVideo() {
        return weifachulkiVideo;
    }


    /**
	 * 获取：内容
	 */

    public void setWeifachulkiVideo(String weifachulkiVideo) {
        this.weifachulkiVideo = weifachulkiVideo;
    }
    /**
	 * 设置：内容
	 */
    public Double getWeifachulkiMoney() {
        return weifachulkiMoney;
    }


    /**
	 * 获取：内容
	 */

    public void setWeifachulkiMoney(Double weifachulkiMoney) {
        this.weifachulkiMoney = weifachulkiMoney;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：详情
	 */
    public String getWeifachulkiContent() {
        return weifachulkiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setWeifachulkiContent(String weifachulkiContent) {
        this.weifachulkiContent = weifachulkiContent;
    }
    /**
	 * 设置：业务状态
	 */
    public Integer getWeifachulkiStatusTypes() {
        return weifachulkiStatusTypes;
    }


    /**
	 * 获取：业务状态
	 */

    public void setWeifachulkiStatusTypes(Integer weifachulkiStatusTypes) {
        this.weifachulkiStatusTypes = weifachulkiStatusTypes;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
