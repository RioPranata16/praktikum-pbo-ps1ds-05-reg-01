/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rio.projectmodul07.Guided2;

public class Invoice implements Payeble {
    private String partName;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partName, int quantity, double pricePerItem){
        this.partName = partName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public String getParName(){
        return partName;
    }
    
    //Hitung tagihan 
    @Override
    public double getPaymentAmount(){
        return quantity * pricePerItem;
    }
}
