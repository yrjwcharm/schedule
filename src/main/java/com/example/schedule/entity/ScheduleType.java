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
 * @since 2024-01-06
 */
@Getter
@Setter
@TableName("schedule_type")
@ApiModel(value = "ScheduleType对象", description = "")
public class ScheduleType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "type_id", type = IdType.ASSIGN_ID)
    private Long typeId;

    @TableField("type_name")
    private String typeName;
}
