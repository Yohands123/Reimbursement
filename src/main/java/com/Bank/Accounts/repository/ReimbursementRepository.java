package com.Bank.Accounts.repository;

import com.Bank.Accounts.model.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Long> {
    // You can define custom query methods if needed
}
