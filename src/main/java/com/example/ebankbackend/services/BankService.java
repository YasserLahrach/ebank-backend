package com.example.ebankbackend.services;

import com.example.ebankbackend.entities.BankAccount;
import com.example.ebankbackend.entities.CurrentAccount;
import com.example.ebankbackend.entities.SavingAccount;
import com.example.ebankbackend.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount=bankAccountRepository.findById("3da3e2e9-aa3f-495f-bb8a-b31dc62b588f").orElse(null);
        if(bankAccount!=null){
            System.out.println("*********");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if(bankAccount instanceof CurrentAccount){
                System.out.println("Over Draft=>"+((CurrentAccount)bankAccount).getOverDraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.println("Rate=>"+((SavingAccount)bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperations().forEach(op->{
                System.out.println("=================");
                System.out.println(op.getType()+"\t"+op.getOperationDate()+"\t"+op.getAmount());
            });}
    }
}
