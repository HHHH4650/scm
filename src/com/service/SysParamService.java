package com.service;

import java.util.Map;

import com.entity.SysParam;

public interface SysParamService extends BaseService<SysParam> {
	
	//加载系统参数
	public Map<String, Object> sysParamLoad();
}
