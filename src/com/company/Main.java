package com.company;

public class Main {

    public static void main(String[] args) {
        Person sickPerson = new Person("Jo");
        Doctor doc = new Doctor("Shady Online U", 5000);
        doc.treatPatient(sickPerson);
        var doc2 = new Surgeon();
        doc2.treatPatient(sickPerson);
        }
    }
