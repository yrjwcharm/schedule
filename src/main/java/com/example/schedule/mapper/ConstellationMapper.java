package com.example.schedule.mapper;

import com.example.schedule.entity.Constellation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-23
 */
@Mapper
public interface ConstellationMapper extends BaseMapper<Constellation> {
    @Select("SELECT id,name, icon, start_date, end_date, xztd, sxsx, zggw, yysx, zdtz, zgxx, xyys, jxsw, xyhm, kyjs, bx, yd, qd, jbtz, jttz, xsfg, gxmd, zj FROM constellation " +
            "WHERE #{date} BETWEEN start_date  AND end_date ")
    Constellation findConstellationByDate(@Param("date") @DateTimeFormat(pattern = "MM-dd") String date);
}
