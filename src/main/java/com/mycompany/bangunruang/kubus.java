/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author ABMEngine
 */
public class kubus {
    private double sisi;
    private double volume;

    public kubus() {
        this.sisi = 5;
    }

    public kubus(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void ComputeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.sisi;
        System.out.println("volume = " + this.sisi + " * " + this.sisi + " * " + this.sisi);
        System.out.println("volume = " + this.volume);
    }

    public double GetVolume() {
        return this.volume;
    }
}
