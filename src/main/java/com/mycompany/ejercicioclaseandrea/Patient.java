/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioclaseandrea;

import java.util.Date;

/**
 *
 * @author white
 */
public class Patient {
 String Name;
 String Address;
 String DateBirthday;
 int phone;
 int Medicare;
 String Status; 

    public Patient(String Name, String Address, String DateBirthday, int phone, int Medicare, String Status) {
        this.Name = Name;
        this.Address = Address;
        this.DateBirthday = DateBirthday;
        this.phone = phone;
        this.Medicare = Medicare;
        this.Status = Status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDateBirthday() {
        return DateBirthday;
    }

    public void setDateBirthday(String DateBirthday) {
        this.DateBirthday = DateBirthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMedicare() {
        return Medicare;
    }

    public void setMedicare(int Medicare) {
        this.Medicare = Medicare;
    }

    public String isStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
 
}
