/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul06.guided3;

public class Main {
  public static void main(String[] args){
    Lagu d,e;
    d = new Lagu();
    e = new Lagu();
    
    d.isiParam("Lagu 1");
    e.isiParam("Lagu 2", "aku");
    
    d.tampilkan();
    e.tampilkan();
  }
}
