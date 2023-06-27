/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author ABMEngine
 */
public class tabung {
    private double radius;
    private double tinggi;
    private double volume;
    private final double phi = 22 / 7;

    public tabung() {
        this.radius = 5;
        this.tinggi = 5;
    }
    public tabung(double radius) {
        this.radius = radius;
        this.tinggi = radius;
    }

    public tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }

    public void SetTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    

    public void ComputeAndSetVolume() {
        this.volume = (this.phi * this.radius * this.radius) * this.tinggi;
        System.out.println("volume = " + this.phi + " * " + this.radius + " * " + this.radius + " * " + this.tinggi);
        System.out.println("volume = " + this.volume);

    }

    public double GetVolume() {
        return this.volume;
    }
}
