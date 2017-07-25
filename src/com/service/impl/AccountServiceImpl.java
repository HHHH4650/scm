package com.service.impl;

import org.springframework.stereotype.Service;

import com.entity.Account;
import com.service.AccountService;

@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {

	@Override
	public Account login(Account account) {
		// TODO Auto-generated method stub
		return accountMapper.login(account);
	}	

}
