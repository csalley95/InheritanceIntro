package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person sickPerson = new Person("Jo");
        var sickerPerson2 = new Person("Ed");
        var docList = new ArrayList<Doctor>();
        Doctor doc = new Doctor("Shady Online U", 5000);
        docList.add(doc);
        doc.treatPatient(sickPerson);
        var doc2 = new Surgeon("Western Wyoming School of Mines", 200);
        docList.add(doc2);
        for (Doctor onCallDoc: docList){
            onCallDoc.treatPatient(sickPerson);
            onCallDoc.treatPatient(sickerPerson2);
        }
        //doc2.treatPatient(sickPerson);
        }
    }
