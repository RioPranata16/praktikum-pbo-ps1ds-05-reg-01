/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul07.Guided2;

public abstract class Employee implements Payeble {
   private String name;
   
   public Employee(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   //Setiap pegawai punya pengganti, tapi rumus nya berbeda
   public abstract double earnings();
   
   @Override
   public double getPaymentAmount(){
       return earnings();
   }
}
