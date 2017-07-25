package com.service;

import java.util.List;
import java.util.Map;

import com.entity.AccountRecords;

public interface AccountRecordsService extends BaseService<AccountRecords> {
	
	 List<Map<String, Object>> selectSupplier(Map<String, String> paramMap);

}
