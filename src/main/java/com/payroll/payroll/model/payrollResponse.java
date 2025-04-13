package com.payroll.payroll.model;

public class payrollResponse {
    private String payrollDate;

    public payrollResponse(String payrollDate) {
        this.payrollDate = payrollDate;
    }

    public String getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(String payrollDate) {
        this.payrollDate = payrollDate;
    }
}
