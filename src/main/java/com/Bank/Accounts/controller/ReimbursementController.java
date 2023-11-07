package com.Bank.Accounts.controller;

import com.Bank.Accounts.dto.ReimbursementDTO;
import com.Bank.Accounts.model.Reimbursement;
import com.Bank.Accounts.service.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reimbursement")
public class ReimbursementController{
    private final ReimbursementService reimbursementService;

    @Autowired
    public ReimbursementController(ReimbursementService reimbursementService) {
        this.reimbursementService = reimbursementService;
    }

    @PostMapping("/submit")
    public ResponseEntity<Reimbursement> submitReimbursement(@RequestBody ReimbursementDTO requestDTO) {
        Reimbursement reimbursement = reimbursementService.submitReimbursement(requestDTO);
        return ResponseEntity.ok(reimbursement);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Reimbursement>> getAllReimbursements() {
        List<Reimbursement> reimbursements = reimbursementService.getAllReimbursements();
        return ResponseEntity.ok(reimbursements);
    }
    @DeleteMapping
    ("/delete/{id}")
    public ResponseEntity<Void> deleteReimbursement(@PathVariable Long id) {
        reimbursementService.deleteReimbursement(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping
    ("/update/{id}")
    public ResponseEntity<Reimbursement> updateReimbursement(@PathVariable Long id, @RequestBody ReimbursementDTO requestDTO) {

        Reimbursement reimbursement = reimbursementService.updateReimbursement(id, requestDTO);
        return ResponseEntity.ok(reimbursement);
    }

}
