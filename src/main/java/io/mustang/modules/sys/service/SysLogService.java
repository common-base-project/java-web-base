

package io.mustang.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.mustang.common.utils.PageUtils;
import io.mustang.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mustang
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
