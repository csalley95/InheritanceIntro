package com.company;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {

        var allEmployees = new ArrayList<Employee>();
        Employee emp = new CommissionEmployee();
        //would like to call make sale - why can't I?
        //Can't call the makeSale method because it isn't part of the Employee class
        //Since we told the user that emp is a CommissionEmployee now we can call makeSale
        CommissionEmployee ComEmp = (CommissionEmployee)emp;
        ComEmp.makeSale();
        allEmployees.add(emp);
        emp = new SalariedEmployee(50000);
        allEmployees.add(emp);

        for (var payee: allEmployees){
            System.out.println("paying employee"+  payee.calculateBiWeeklyPay());
        }
    }
}