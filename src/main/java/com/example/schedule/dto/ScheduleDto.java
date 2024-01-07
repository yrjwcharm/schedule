package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import lombok.Data;

@Data
public class ScheduleDto extends Schedule {
    private String avatarUrl;
    private String nickName;
    private String categoryName;
}
