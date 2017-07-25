package com.service;

import com.entity.Account;

public interface AccountService extends BaseService<Account> {
	
	public Account login(Account account);
	
}
