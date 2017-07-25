package com.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.entity.AccountRecords;
import com.service.AccountRecordsService;

@Service("accountRecordsService")
public class AccountRecordsServiceImpl extends BaseServiceImpl<AccountRecords> implements AccountRecordsService {

	@Override
	public List<Map<String, Object>> selectSupplier(Map<String, String> paramMap) {

		return accountRecordsMapper.selectSupplier(paramMap);
	}
	
}
