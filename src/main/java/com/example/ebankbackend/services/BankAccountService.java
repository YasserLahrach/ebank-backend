package com.example.ebankbackend.services;

import com.example.ebankbackend.entities.BankAccount;
import com.example.ebankbackend.entities.Customer;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    BankAccount saveBankAccount();
}
