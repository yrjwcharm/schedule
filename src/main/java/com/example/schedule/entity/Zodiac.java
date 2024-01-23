package com.example.schedule.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-22
 */
@Getter
@Setter
@TableName("zodiac")
@ApiModel(value = "Zodiac对象", description = "")
public class Zodiac implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("icon")
    private String icon;

    @TableField("birth_range")
    private String birthRange;

    @TableField("wx")
    private String wx;

    @TableField("bmf")
    private String bmf;

    @TableField("jxys")
    private String jxys;

    @TableField("dxys")
    private String dxys;

    @TableField("xysz")
    private String xysz;

    @TableField("dxsz")
    private String dxsz;

    @TableField("xyh")
    private String xyh;

    @TableField("jxfw")
    private String jxfw;

    @TableField("ys")
    private String ys;

    @TableField("yd")
    private String yd;

    @TableField("qd")
    private String qd;

    @TableField("sy")
    private String sy;

    @TableField("aq")
    private String aq;

    @TableField("cf")
    private String cf;

    @TableField("jk")
    private String jk;

    @TableField("yp")
    private String yp;

    @TableField("yptz")
    private String yptz;

    @TableField("yj")
    private String yj;

    @TableField("yjtz")
    private String yjtz;
}
