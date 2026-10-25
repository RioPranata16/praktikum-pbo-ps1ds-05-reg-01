/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul06.guided3;

public class Lagu {
   String pencipta;
   String judul;
   
   void isiParam(String param1){
       judul = param1;
       pencipta = "Tidak dikenal";
   }
   
   void isiParam(String param1, String param2){
       judul = param1;
       pencipta = param2;
   }
   
   void tampilkan(){
       System.out.println("Judul: "+ judul + ", pencipta: " + pencipta);
   }
}
