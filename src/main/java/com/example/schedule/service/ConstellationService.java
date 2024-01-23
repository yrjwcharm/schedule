package com.example.schedule.service;

import com.example.schedule.entity.Constellation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-23
 */
public interface ConstellationService extends IService<Constellation> {
    Constellation getConstellation(String date);
}
