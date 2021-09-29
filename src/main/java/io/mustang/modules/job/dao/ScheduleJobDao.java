

package io.mustang.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mustang.modules.job.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Mustang
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {

	/**
	 * 批量更新状态
	 * @param map
	 * @return
	 */
	int updateBatch(Map<String, Object> map);
}
