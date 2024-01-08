package com.example.schedule.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author austin
 * @since 2024-01-01
 */
@Getter
@Setter
@TableName("schedule")
@ApiModel(value = "Schedule对象", description = "")

@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "schedule_id", type = IdType.ASSIGN_ID)
    private Long scheduleId;

    @TableField("schedule_name")
    private String scheduleName;

    @TableField("start_date")
    private LocalDate startDate;

    @TableField("end_date")
    private LocalDate endDate;

    @TableField("user_id")
    private Long userId;

    @TableField("type_id")
    private Long typeId;

    @TableField("open_remind")
    private Integer openRemind;

    @TableField("status")
    private Integer status;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @TableField("schedule_arrange")
    private String scheduleArrange;

    @TableField("photos")
    private String photos;

    @TableField("view_count")
    private Integer viewCount;

    @TableField("remind_time")
    private LocalDateTime remindTime;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

//    @JsonIgnore
//    public String getScheduleArrange() {
//        return scheduleArrange;
//    }
}
