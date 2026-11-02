/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul07.Guided2;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    public SalariedEmployee(String name, double weeklySalary){
        super(name);
        this.weeklySalary = weeklySalary;
    }
    
    @Override 
    public double earnings(){
        return weeklySalary;
    }
}
