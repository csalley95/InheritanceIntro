package com.company;

public class Doctor {
    protected String AlmaMater;
    private double fee;

//    public Doctor(){
//        AlmaMater = "Surgery University";
//        fee = 100;
//    }

    public Doctor(String university, double price){
        AlmaMater = university;
        fee = price;
    }

    public void treatPatient(Person patient){
        System.out.println("Take two every twelve hours");
        patient.takeMedicine();
    }

    public double billPatient(Person patient){
        patient.payBill(fee);
        return fee;
    }

    public double billPatient(boolean medicarePatient, GovernmentProgram govProgram) {
        govProgram.processPaperwork(fee);
        return fee;
    }

}
