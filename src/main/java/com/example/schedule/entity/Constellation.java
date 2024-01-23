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
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-23
 */
@Getter
@Setter
@TableName("constellation")
@ApiModel(value = "Constellation对象", description = "")
public class Constellation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("icon")
    private String icon;

    @TableField("start_date")
    @DateTimeFormat(pattern = "MM-dd")
    private String startDate;

    @TableField("end_date")
    @DateTimeFormat(pattern = "MM-dd")
    private String endDate;

    @TableField("xztd")
    private String xztd;

    @TableField("sxsx")
    private String sxsx;

    @TableField("zggw")
    private String zggw;

    @TableField("yysx")
    private String yysx;

    @TableField("zdtz")
    private String zdtz;

    @TableField("zgxx")
    private String zgxx;

    @TableField("xyys")
    private String xyys;

    @TableField("jxsw")
    private String jxsw;

    @TableField("xyhm")
    private String xyhm;

    @TableField("kyjs")
    private String kyjs;

    @TableField("bx")
    private String bx;

    @TableField("yd")
    private String yd;

    @TableField("qd")
    private String qd;

    @TableField("jbtz")
    private String jbtz;

    @TableField("jttz")
    private String jttz;

    @TableField("xsfg")
    private String xsfg;

    @TableField("gxmd")
    private String gxmd;

    @TableField("zj")
    private String zj;
}
