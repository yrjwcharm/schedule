package com.example.schedule.mapper;

import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.ScheduleCollect;
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
 * @author yanruifeng
 * @since 2024-01-12
 */
@Mapper
public interface ScheduleCollectMapper extends BaseMapper<ScheduleCollect> {
    @Select("SELECT * " +
            "FROM schedule s, schedule_collect sc, user u,schedule_category t " +
            "WHERE s.schedule_id = sc.schedule_id " +
            "AND s.category_id = t.category_id "+
            "AND sc.user_id = #{currentUserId} " +
            "AND s.user_id = u.user_id " +
            "AND sc.collect_status= 1 "+
            "ORDER BY sc.id DESC " +
            "LIMIT #{offset} OFFSET #{pageSize}")
    List<ScheduleDto> getCollectedSchedules(@Param("currentUserId") Long currentUserId,
                                            @Param("offset") int offset,
                                            @Param("pageSize") int pageSize
                                                   );
    @Select("SELECT COUNT(*) FROM schedule_collect sc WHERE user_id=#{userId} AND collect_status=1")
    int getCollectCount(@Param("userId") Long userId);
}
