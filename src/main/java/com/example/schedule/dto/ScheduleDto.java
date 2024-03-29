package com.example.schedule.dto;

import com.example.schedule.entity.Schedule;
import com.example.schedule.entity.ScheduleArrange;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ScheduleDto extends Schedule {
    private String avatarUrl;
    private String nickName;
    private String categoryName;
    private int  collectStatus;
    private List<ScheduleArrange> scheduleArrangeList;
    private List<Map<String,Object>> photosList;
}
