package com.example.schedule.mapper;

import com.example.schedule.entity.Schedule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author austin
 * @since 2024-01-01
 */
@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule> {

}
