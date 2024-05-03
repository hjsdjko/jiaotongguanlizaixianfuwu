package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 机动车业务
 *
 * @author 
 * @email
 */
@TableName("jidongche")
public class JidongcheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JidongcheEntity() {

	}

	public JidongcheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jidongche{" +
            "id=" + id +
            ", jidongcheName=" + jidongcheName +
            ", jidongcheTypes=" + jidongcheTypes +
            ", jidongcheTime=" + jidongcheTime +
            ", yonghuId=" + yonghuId +
            ", jidongcheContent=" + jidongcheContent +
            ", jidongcheYesnoTypes=" + jidongcheYesnoTypes +
            ", jidongcheYesnoText=" + jidongcheYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
