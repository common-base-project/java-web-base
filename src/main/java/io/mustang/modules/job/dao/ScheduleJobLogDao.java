

package io.mustang.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mustang.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Mustang
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
