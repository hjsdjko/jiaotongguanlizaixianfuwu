package com.entity.vo;

import com.entity.JiashizhengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 驾驶证业务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiashizheng")
public class JiashizhengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "jiashizheng_name")
    private String jiashizhengName;


    /**
     * 驾驶证业务类型
     */

    @TableField(value = "jiashizheng_types")
    private Integer jiashizhengTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiashizheng_time")
    private Date jiashizhengTime;


    /**
     * 相关文件
     */

    @TableField(value = "jiashizheng_file")
    private String jiashizhengFile;


    /**
     * 申请用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 详情
     */

    @TableField(value = "jiashizheng_content")
    private String jiashizhengContent;


    /**
     * 申请状态
     */

    @TableField(value = "jiashizheng_yesno_types")
    private Integer jiashizhengYesnoTypes;


    /**
     * 申请结果
     */

    @TableField(value = "jiashizheng_yesno_text")
    private String jiashizhengYesnoText;


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
    public String getJiashizhengName() {
        return jiashizhengName;
    }


    /**
	 * 获取：标题
	 */

    public void setJiashizhengName(String jiashizhengName) {
        this.jiashizhengName = jiashizhengName;
    }
    /**
	 * 设置：驾驶证业务类型
	 */
    public Integer getJiashizhengTypes() {
        return jiashizhengTypes;
    }


    /**
	 * 获取：驾驶证业务类型
	 */

    public void setJiashizhengTypes(Integer jiashizhengTypes) {
        this.jiashizhengTypes = jiashizhengTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getJiashizhengTime() {
        return jiashizhengTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setJiashizhengTime(Date jiashizhengTime) {
        this.jiashizhengTime = jiashizhengTime;
    }
    /**
	 * 设置：相关文件
	 */
    public String getJiashizhengFile() {
        return jiashizhengFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setJiashizhengFile(String jiashizhengFile) {
        this.jiashizhengFile = jiashizhengFile;
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
    public String getJiashizhengContent() {
        return jiashizhengContent;
    }


    /**
	 * 获取：详情
	 */

    public void setJiashizhengContent(String jiashizhengContent) {
        this.jiashizhengContent = jiashizhengContent;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getJiashizhengYesnoTypes() {
        return jiashizhengYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setJiashizhengYesnoTypes(Integer jiashizhengYesnoTypes) {
        this.jiashizhengYesnoTypes = jiashizhengYesnoTypes;
    }
    /**
	 * 设置：申请结果
	 */
    public String getJiashizhengYesnoText() {
        return jiashizhengYesnoText;
    }


    /**
	 * 获取：申请结果
	 */

    public void setJiashizhengYesnoText(String jiashizhengYesnoText) {
        this.jiashizhengYesnoText = jiashizhengYesnoText;
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
