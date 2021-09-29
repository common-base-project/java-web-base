

package io.mustang.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mustang.common.utils.PageUtils;
import io.mustang.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mustang
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	/**
	 * 分页查询
	 * @param params
	 * @return
	 */
	PageUtils queryPage(Map<String, Object> params);
	
}
