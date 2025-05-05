package com.accountservice.account_service.Service;

import com.accountservice.account_service.Entity.Account;
import com.accountservice.account_service.Repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository=accountRepository;
    }
    public Account createAccount(Account account)
    {
        return accountRepository.save(account);
    }

    public List<Account> getAccountsByCustomerId(Long customerId){
        return accountRepository.findByCustomerId(customerId);
    }

    public Account getAccountById(Long id)
    {
        return accountRepository.findById(id).orElse(null);
    }
}
