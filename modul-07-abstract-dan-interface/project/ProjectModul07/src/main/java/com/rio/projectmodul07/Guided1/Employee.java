/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul07.Guided1;

public abstract class Employee {
   private String name;
   
   public Employee(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   //Setiap pegawai punya pengganti, tapi rumus nya berbeda
   public abstract double earnings();
}
