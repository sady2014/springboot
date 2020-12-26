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
 * 产品信息记录
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_product")
@ApiModel(value="BasProduct对象", description="产品信息记录")
public class BasProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @ApiModelProperty(value = "产品来源，配置数据字典")
    @TableField("ProductResource")
    private String ProductResource;

    @ApiModelProperty(value = "来源处产品原标识")
    @TableField("ProductId")
    private String ProductId;

    @ApiModelProperty(value = "产品编码")
    @TableField("ProductCode")
    private String ProductCode;

    @ApiModelProperty(value = "产品名称")
    @TableField("ProductName")
    private String ProductName;

    @ApiModelProperty(value = "版本")
    @TableField("VersionCode")
    private String VersionCode;

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


}
