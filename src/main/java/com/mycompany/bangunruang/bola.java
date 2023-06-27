/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author ABMEngine
 */
public class bola {
    private double radius;
    private double volume;
    private final double phi = 22 / 7;
 
    public bola() {
        this.radius = 5;
    }

    public bola(double radius) {
        this.radius = radius;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
    }
   
    public void ComputeAndSetVolume() {
        this.volume = this.phi * this.radius * this.radius * this.radius * 4 / 3;
        System.out.println("volume = " + this.phi + " * " + this.radius + " * " + this.radius + " * " + this.radius + " * (4/3)");
        System.out.println("volume = " + this.volume);
    }

    public double GetVolume() {
        return this.volume;
    }
}
