/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author ABMEngine
 */
public class mainarray {
    kubus kubus1 = new kubus(3);
    balok balok1 = new balok(10,7,6);
    bola bola1 = new bola(14);
    limas limas1 = new limas(6,12);
    tabung tabung1 = new tabung(5,10);
    bangun[] arraybangun;

    double totalVolume = 0;
        for (bangun bangun : arraybangun) {
            double volume = bangun.ComputeAndSetVolume();
            totalVolume += volume;
            System.out.println("Volume " + bangun.getClass().getSimpleName() + ": " + volume);
        }

        double rataRataVolume = totalVolume / arraybangun.length;

    public mainarray() {
        this.arraybangun = new bangun[]{"Kubus", "Balok", "Bola", "Limas Segi Empat", "Tabung"};
    }
        System.out.println("Rata-rata volume: " + rataRataVolume);
}