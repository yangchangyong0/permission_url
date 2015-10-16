package com.ycy.mapper;

import java.util.List;

import com.ycy.model.SysUser;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     *  根据用户查询用户系统信息
     * @param usercode
     * @return
     */
    List<SysUser> getSysUserByUserCode(String usercode);

}