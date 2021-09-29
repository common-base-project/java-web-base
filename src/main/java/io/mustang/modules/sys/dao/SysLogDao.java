

package io.mustang.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mustang.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Mustang
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
