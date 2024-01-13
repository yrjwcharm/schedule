package com.example.schedule.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.ScheduleArrange;
import com.example.schedule.entity.ScheduleCollect;
import com.example.schedule.mapper.ScheduleCollectMapper;
import com.example.schedule.mapper.ScheduleMapper;
import com.example.schedule.service.ScheduleCollectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-12
 */
@Service
public class ScheduleCollectServiceImpl extends ServiceImpl<ScheduleCollectMapper, ScheduleCollect> implements ScheduleCollectService {
    @Autowired
    private ScheduleCollectMapper scheduleCollectMapper;
    @Override
    public Page<ScheduleDto> getCollectedSchedules(Long currentUserId, int pageSize, int offset) {

        // 获取总记录数
        int totalCount = scheduleCollectMapper.getCollectCount(currentUserId);
        // 获取当前页数据
        List<ScheduleDto> list = scheduleCollectMapper.getCollectedSchedules(currentUserId, offset, pageSize);
        list.forEach(item->{
            if (item.getScheduleArrange() != null) {
                //fastJson
                List<ScheduleArrange> arrayList = JSON.parseObject(item.getScheduleArrange(), new TypeReference<List<ScheduleArrange>>() {});
                item.setScheduleArrangeList(arrayList);
            }
        });


        // 创建并返回包含总记录数、当前页数、每页记录数和当前页数据的PageInfo对象
        Page<ScheduleDto> pageInfo = new Page<>();
        pageInfo.setTotal(totalCount);
        pageInfo.setRecords(list);
        return pageInfo;
    }
}
