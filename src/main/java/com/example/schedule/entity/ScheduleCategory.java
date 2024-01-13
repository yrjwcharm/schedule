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
 * @since 2024-01-14
 */
@Getter
@Setter
@TableName("schedule_category")
@ApiModel(value = "ScheduleCategory对象", description = "")
public class ScheduleCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "category_id", type = IdType.ASSIGN_ID)
    private Long categoryId;

    @TableField("category_name")
    private String categoryName;
}
