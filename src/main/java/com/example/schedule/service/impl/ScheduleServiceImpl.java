package com.example.schedule.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.entity.Schedule;
import com.example.schedule.mapper.ScheduleMapper;
import com.example.schedule.service.ScheduleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author austin
 * @since 2024-01-01
 */
@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule> implements ScheduleService {

}
