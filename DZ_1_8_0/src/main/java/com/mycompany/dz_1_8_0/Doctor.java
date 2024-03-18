/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz_1_8_0;

/**
 *
 * @author dmirtypoluektov
 */

class Doctor {
    private String fullName;
    String specialty;
    private int employeeNumber;
    private int shiftsPerMonth;
    private boolean certificationPassed;

    public Doctor(String fullName, String specialty, int employeeNumber, int shiftsPerMonth, boolean certificationPassed) {
        this.fullName = fullName;
        this.specialty = specialty;
        this.employeeNumber = employeeNumber;
        this.shiftsPerMonth = shiftsPerMonth;
        this.certificationPassed = certificationPassed;
    }

    public String getFullName() {
        return fullName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public boolean isCertificationPassed() {
        return certificationPassed;
    }

    public void setCertificationPassed(boolean certificationPassed) {
        this.certificationPassed = certificationPassed;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getShiftsPerMonth() {
        return shiftsPerMonth;
    }

    public void setShiftsPerMonth(int shiftsPerMonth) {
        this.shiftsPerMonth = shiftsPerMonth;
    }
    
    
}
