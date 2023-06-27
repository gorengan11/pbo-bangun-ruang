/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/*
 *
 * @author ABMEngine
 */
public class balok implements bangun {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double volume;

    public balok() {
        this.panjang = 5;
        this.lebar = 5;
        this.tinggi = 5;
    }

    public balok(double sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.tinggi = sisi;
    }

    public balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = lebar;
    }

    public balok(double panjang, double lebar, double tinggi) {
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        this.volume = this.panjang * this.lebar * this.tinggi;
        System.out.println("volume = " + this.panjang + " * " + this.lebar + " * " + this.tinggi);
        System.out.println("volume = " + this.volume);
        return this.volume;
    }

    public double getVolume() {
        return this.volume;
    }
}
