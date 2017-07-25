package com.dao;

import com.entity.Account;

public interface AccountMapper extends BaseMapper<Account> {
  
	public Account login(Account account);
}