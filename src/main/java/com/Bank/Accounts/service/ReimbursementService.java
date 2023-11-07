package com.Bank.Accounts.service;

import com.Bank.Accounts.dto.ReimbursementDTO;
import com.Bank.Accounts.model.Reimbursement;
import com.Bank.Accounts.repository.ReimbursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReimbursementService {
    private final ReimbursementRepository reimbursementRepository;

    @Autowired
    public ReimbursementService(ReimbursementRepository reimbursementRepository) {
        this.reimbursementRepository = reimbursementRepository;
    }

    public Reimbursement submitReimbursement(ReimbursementDTO requestDTO) {
        // Convert the DTO to a model and save it to the database
        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setFullName(requestDTO.getFullName());
        reimbursement.setEmployeeId(requestDTO.getEmployeeId());
        reimbursement.setEmail(requestDTO.getEmail());
        reimbursement.setPhone(requestDTO.getPhone());
        reimbursement.setExpenseCategory(requestDTO.getExpenseCategory());
        reimbursement.setExpenseDescription(requestDTO.getExpenseDescription());
        reimbursement.setOriginalReceipts(requestDTO.getOriginalReceipts());
        reimbursement.setMailingAdress(requestDTO.getMailingAdress());
        // Set other fields from the DTO

        return reimbursementRepository.save(reimbursement);
    }

    public List<Reimbursement> getAllReimbursements() {
        return reimbursementRepository.findAll();
    }

    public void deleteReimbursement(Long id) {
        reimbursementRepository.deleteById(id);
    }

    public Reimbursement updateReimbursement(Long id, ReimbursementDTO requestDTO) {
        Reimbursement reimbursement = reimbursementRepository.findById(id).orElseThrow();
        reimbursement.setFullName(requestDTO.getFullName());
        reimbursement.setEmployeeId(requestDTO.getEmployeeId());
        reimbursement.setEmail(requestDTO.getEmail());
        reimbursement.setPhone(requestDTO.getPhone());
        reimbursement.setExpenseCategory(requestDTO.getExpenseCategory());
        reimbursement.setExpenseDescription(requestDTO.getExpenseDescription());
        reimbursement.setOriginalReceipts(requestDTO.getOriginalReceipts());
        reimbursement.setMailingAdress(requestDTO.getMailingAdress());
        return reimbursementRepository.save(reimbursement); // Save the updated model to the database
    }
}
