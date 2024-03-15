package com.example.bankingApp.service;

import com.example.bankingApp.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountByID(Long id);
    AccountDto depositAmount(Long id, double amount);
}

