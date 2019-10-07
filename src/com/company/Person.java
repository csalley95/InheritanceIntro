package com.company;

public class Person {
    private String name;

    public Person(String givenName){
        this.name = givenName;
    }

    public void payBill(double bill){
        System.out.println("I just payed my "+ bill +" bill \n"+ name);
    }

    public void takeMedicine(){
        System.out.println(name + " is taking medicine now.");
    }

    public void getOperatedOn(){
        System.out.println(name + " is being operated on.");
    }

    public String recover(int recoveryTime) {
        for (int i = 1; i <= recoveryTime; i = i++) {
            System.out.println("Ouch " + name + " is recovering.");
        }
        return name+ " has recovered.";
    }
}
