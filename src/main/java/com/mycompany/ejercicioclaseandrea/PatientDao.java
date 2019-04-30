/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioclaseandrea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author white
 */
public class PatientDao {
    private static final Map<String, Patient> empMap = new HashMap<String, Patient>();
    static {
        initPatient();
    }
 
    private static void initPatient() {
        Patient pa1 = new Patient("Andrea Ruiz", "Calle 128b", "1996-04-14" , 3217, 00, "private");
        Patient pa2 = new Patient("Sara Cham", "carrera 13", "1998-05-30" , 654, 01, "private");
        Patient pa3 = new Patient("Jeferson Cruz", "Avenida 45", "1995-08-3" , 786, 04, "private");
 
        empMap.put(pa1.getName(), pa1);
        empMap.put(pa2.getName(), pa2);
        empMap.put(pa3.getName(), pa3);
    }
 
    public static Patient getPatient(String Name) {
        return empMap.get(Name);
    }
 
    public static Patient addPatient(Patient pa) {
        empMap.put(pa.getName(), pa);
        return pa;
    }
 

    public static List<Patient> getAllPatient() {
        Collection<Patient> c = empMap.values();
        List<Patient> list = new ArrayList<Patient>();
        list.addAll(c);
        return list;
    }
     
    List<Patient> list;
}

