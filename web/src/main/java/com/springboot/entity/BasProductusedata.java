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
 * 
 * </p>
 *
 * @author Mugau
 * @since 2020-12-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bas_productusedata")
@ApiModel(value="BasProductusedata对象", description="")
public class BasProductusedata implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    @ApiModelProperty(value = "使用数据来源，配置数据字典")
    @TableField("DataResource")
    private String DataResource;

    @ApiModelProperty(value = "来源处数据原标识")
    @TableField("UseDataId")
    private String UseDataId;

    @ApiModelProperty(value = "来源处产品原标识")
    @TableField("ProductId")
    private String ProductId;

    @ApiModelProperty(value = "来源处产品名称")
    @TableField("ProductName")
    private String ProductName;

    @ApiModelProperty(value = "来源处产品地区原标识")
    @TableField("RegionId")
    private String RegionId;

    @ApiModelProperty(value = "来源处产品地区名称")
    @TableField("RegionName")
    private String RegionName;

    @ApiModelProperty(value = "锁编号")
    @TableField("KeySerial")
    private String KeySerial;

    @ApiModelProperty(value = "锁序列号")
    @TableField("KeySN")
    private String KeySN;

    @ApiModelProperty(value = "版本（如2016版）")
    @TableField("Version")
    private String Version;

    @ApiModelProperty(value = "内部版本（如403、或1.0.0.403）")
    @TableField("InnerVersion")
    private String InnerVersion;

    @ApiModelProperty(value = "IP地址")
    @TableField("IP")
    private String ip;

    @ApiModelProperty(value = "锁类型")
    @TableField("KeySNType")
    private String KeySNType;

    @ApiModelProperty(value = "登录名称")
    @TableField("LoginName")
    private String LoginName;

    @ApiModelProperty(value = "操作系统版本")
    @TableField("OSVersion")
    private String OSVersion;

    @ApiModelProperty(value = "软件开启的持续时间长度，单位为秒，整数")
    @TableField("LastOut")
    private Integer LastOut;

    @ApiModelProperty(value = "客户端登录时间")
    @TableField("LoginDateLocal")
    private LocalDateTime LoginDateLocal;

    @ApiModelProperty(value = "服务端登录时间，由新增记录时写入服务端时间")
    @TableField("LoginDateServer")
    private LocalDateTime LoginDateServer;

    @ApiModelProperty(value = "根据IP生成省名称")
    @TableField("Province")
    private String Province;

    @ApiModelProperty(value = "根据IP生成市名称")
    @TableField("City")
    private String City;

    @ApiModelProperty(value = "根据IP取到的详细地址")
    @TableField("IPAddress")
    private String IPAddress;

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
