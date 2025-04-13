package com.payroll.payroll.controller;

import com.payroll.payroll.model.payrollRequest;
import com.payroll.payroll.model.payrollResponse;
import com.payroll.payroll.service.payrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/payroll")
public class payrollController {

    @Autowired
    private payrollService payrollService;

    @PostMapping("/next")
    public payrollResponse getNextPayrollDate(@RequestBody payrollRequest request) {
        LocalDate date = LocalDate.parse(request.getInputDate());
        LocalDate nextDate = payrollService.getNextPayrollDate(date);
        return new payrollResponse(nextDate.toString());
    }
}

