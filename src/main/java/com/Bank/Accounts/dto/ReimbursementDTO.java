package com.Bank.Accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReimbursementDTO {
    private String fullName;
    private String employeeId;
    private String email;
    private String phone;
    private String expenseDescription;
    private String expenseCategory;
    private String originalReceipts;
    private String MailingAdress;

    // Add fields for expense details, payment information, etc.

    // Getter and setter methods for all fields
}
