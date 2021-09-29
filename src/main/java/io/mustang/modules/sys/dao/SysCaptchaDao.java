

package io.mustang.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mustang.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Mustang
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
