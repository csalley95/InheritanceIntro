package com.company;

public class Doctor {
    protected String AlmaMater;
    private double fee;

    public Doctor(){
        AlmaMater = "Surgery University";
        fee = 100;
    }

    public Doctor(String university, double price){
        AlmaMater = university;
        fee = price;
    }

    public void treatPatient(Person patient){
        System.out.println("Take two every three hours.");
    }

    public double billPatient(Person patient){return fee;}
    public double billPatient(boolean medicarePatient, GovernmentProgram govProgram){return  fee;}
}
