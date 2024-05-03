package com.entity.vo;

import com.entity.JidongcheEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 机动车业务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jidongche")
public class JidongcheVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jidongche_name")
    private String jidongcheName;


    /**
     * 机动车业务类型
     */

    @TableField(value = "jidongche_types")
    private Integer jidongcheTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jidongche_time")
    private Date jidongcheTime;


    /**
     * 申请用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 详情
     */

    @TableField(value = "jidongche_content")
    private String jidongcheContent;


    /**
     * 申请状态
     */

    @TableField(value = "jidongche_yesno_types")
    private Integer jidongcheYesnoTypes;


    /**
     * 申请结果
     */

    @TableField(value = "jidongche_yesno_text")
    private String jidongcheYesnoText;


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
    public String getJidongcheName() {
        return jidongcheName;
    }


    /**
	 * 获取：标题
	 */

    public void setJidongcheName(String jidongcheName) {
        this.jidongcheName = jidongcheName;
    }
    /**
	 * 设置：机动车业务类型
	 */
    public Integer getJidongcheTypes() {
        return jidongcheTypes;
    }


    /**
	 * 获取：机动车业务类型
	 */

    public void setJidongcheTypes(Integer jidongcheTypes) {
        this.jidongcheTypes = jidongcheTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getJidongcheTime() {
        return jidongcheTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setJidongcheTime(Date jidongcheTime) {
        this.jidongcheTime = jidongcheTime;
    }
    /**
	 * 设置：申请用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申请用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：详情
	 */
    public String getJidongcheContent() {
        return jidongcheContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJidongcheContent(String jidongcheContent) {
        this.jidongcheContent = jidongcheContent;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getJidongcheYesnoTypes() {
        return jidongcheYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setJidongcheYesnoTypes(Integer jidongcheYesnoTypes) {
        this.jidongcheYesnoTypes = jidongcheYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getJidongcheYesnoText() {
        return jidongcheYesnoText;
    }


    /**
	 * 获取：申请结果
	 */

    public void setJidongcheYesnoText(String jidongcheYesnoText) {
        this.jidongcheYesnoText = jidongcheYesnoText;
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
