/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author ABMEngine
 */
public class limas {
     private double sisi;
     private double tinggi;
     private double volume;
 
    public limas() {
        this.sisi = 5;
        this.tinggi = 5;
    }
    
    public limas(double sisi) {
        this.sisi = sisi;
        this.tinggi = sisi;
    }

    public limas(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public void SetSisi(double sisi) {
        this.sisi = sisi;
    }

    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
   

    public void ComputeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.tinggi / 3;
        System.out.println("volume = " + this.sisi + " * " + this.sisi + " * " + this.tinggi + " / 3");
        System.out.println("volume = " + this.volume);

    }

    public double GetVolume() {
        return this.volume;
    }
}
