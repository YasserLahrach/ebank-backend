package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entities.AccountOperation;
import com.example.ebankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}
