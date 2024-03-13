package com.example.bankingApp.service;

import com.example.bankingApp.dto.AccountDto;
import com.example.bankingApp.entity.Account;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
}
