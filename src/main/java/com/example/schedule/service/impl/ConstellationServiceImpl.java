package com.example.schedule.service.impl;

import com.example.schedule.entity.Constellation;
import com.example.schedule.mapper.ConstellationMapper;
import com.example.schedule.service.ConstellationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-23
 */
@Service
public class ConstellationServiceImpl extends ServiceImpl<ConstellationMapper, Constellation> implements ConstellationService {
       @Autowired
        private ConstellationMapper constellationMapper;
        public Constellation getConstellation(String date){
            return constellationMapper.findConstellationByDate(date);
        }
}
