package com.Bank.Accounts.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "reimbursement")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reimbursement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String employeeId;
    private String email;
    private String phone;
    private String expenseDescription;
    private String expenseCategory;
    private String originalReceipts;
    private String MailingAdress;



}