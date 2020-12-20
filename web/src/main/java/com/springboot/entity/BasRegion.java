package com.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 产品地区信息
 * </p>
 *
 * @author Mugua
 * @since 2020-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_region")
@ApiModel(value="BasRegion对象", description="产品地区信息")
public class BasRegion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @ApiModelProperty(value = "产品地区来源，配置数据字典")
    @TableField("RegionResource")
    private String RegionResource;

    @ApiModelProperty(value = "来源处产品地区原标识")
    @TableField("RegionId")
    private String RegionId;

    @ApiModelProperty(value = "地区名称")
    @TableField("RegionName")
    private String RegionName;

    @ApiModelProperty(value = "备注")
    @TableField("Remark")
    private String Remark;

    @ApiModelProperty(value = "是否删除，0：未删除，1：删除")
    @TableField("IsDel")
    private String IsDel;

    @ApiModelProperty(value = "创建人")
    @TableField("Creator")
    private String Creator;

    @ApiModelProperty(value = "创建时间")
    @TableField("CreationTime")
    private LocalDateTime CreationTime;

    @ApiModelProperty(value = "修改人")
    @TableField("Modifier")
    private String Modifier;

    @ApiModelProperty(value = "修改时间")
    @TableField("ModifiedTime")
    private LocalDateTime ModifiedTime;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getRegionResource() {
        return RegionResource;
    }

    public void setRegionResource(String regionResource) {
        RegionResource = regionResource;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String regionName) {
        RegionName = regionName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getIsDel() {
        return IsDel;
    }

    public void setIsDel(String isDel) {
        IsDel = isDel;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public LocalDateTime getCreationTime() {
        return CreationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        CreationTime = creationTime;
    }

    public String getModifier() {
        return Modifier;
    }

    public void setModifier(String modifier) {
        Modifier = modifier;
    }

    public LocalDateTime getModifiedTime() {
        return ModifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        ModifiedTime = modifiedTime;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BasRegion{" +
                "Id=" + Id +
                ", RegionResource='" + RegionResource + '\'' +
                ", RegionId='" + RegionId + '\'' +
                ", RegionName='" + RegionName + '\'' +
                ", Remark='" + Remark + '\'' +
                ", IsDel='" + IsDel + '\'' +
                ", Creator='" + Creator + '\'' +
                ", CreationTime=" + CreationTime +
                ", Modifier='" + Modifier + '\'' +
                ", ModifiedTime=" + ModifiedTime +
                '}';
    }
}
