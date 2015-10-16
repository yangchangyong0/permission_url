package com.ycy.service;

import com.ycy.model.ActiveUser;
import com.ycy.model.SysPermission;

import java.util.List;


/**
 *
 * <p>Title: SysService</p>
 * <p>Description: 认证授权服务接口</p>
 */
public interface SysService {

	//根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public ActiveUser authenticat(String userCode, String password) throws Exception;
}
