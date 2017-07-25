package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.AccountRecords;

public interface AccountRecordsMapper extends BaseMapper<AccountRecords> {
   List<Map<String, Object>> selectSupplier(Map<String, String> paramMap);
}