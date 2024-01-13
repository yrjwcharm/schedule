package com.example.schedule.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.Schedule;
import com.example.schedule.entity.ScheduleCollect;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-12
 */
public interface ScheduleCollectService extends IService<ScheduleCollect> {
    Page<ScheduleDto> getCollectedSchedules(Long currentUserId, int offset, int pageSize);
}
