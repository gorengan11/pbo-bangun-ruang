/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bangunruang;

import java.util.Scanner;

/**
 *
 * @author ABMEngine
 */
public class Bangunruang {

    @SuppressWarnings({"null", "UnusedAssignment"})
    public static void main(String[] args) {
        int pilihan;
        int pilihanangka;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===============================");
            System.out.println(" MENU PERHITUNGAN BANGUN RUANG ");
            System.out.println("===============================");
            System.out.println("Pilih bangun datar : ");
            System.out.print("1. Kubus\n2. Balok\n3. Tabung\n4. Limas Segi Empat\n5. Bola \nMasukan Bangun Datar (1/2/3/4/5) : ");
            pilihan = input.nextInt();
            System.out.println("Pilih Inputan Angka : ");
            System.out.print("1. Manual\n2. Auto (5)\nMasukan Jenis Inputan (1/2) : ");
            pilihanangka = input.nextInt();
            double volume = 0.0;
            
            switch(pilihan){
                case 1 -> {
                    kubus kubus;
                    switch (pilihanangka){
                        case 1 -> {
                            System.out.print("Masukkan Sisi : ");
                            double sisi = input.nextDouble();
                            kubus = new kubus(sisi);
                            kubus.setSisi(sisi);
                            }
                        default -> kubus = new kubus();
                    }
                    kubus.ComputeAndSetVolume();
                    volume = kubus.GetVolume();
                    break;
                }
                    
                
                case 2 -> {
                    balok balok = null;
//                    switch (pilihanangka){
//                        case 1 -> {
//                            System.out.println("Pilih Macam Inputan");
//                            System.out.println("1. Panjang (L dan T = P)");
//                          System.out.println("2. Panjang, Lebar (T = L)");
//                            System.out.println("3. Panjang, Lebar, Tinggi");
//                            System.out.println("4. Auto (default = 5)");
//                            System.out.print("Pilihan (1/2/3/4) : ");
//                            pilihan = input.nextInt();
//                            switch (pilihan) {
//                                case 1 ->                      {
//                                    System.out.print("Masukkan Panjang : ");
//                                    double panjang = input.nextDouble();
//                                    balok = new balok(panjang);
//                                    balok.setPanjang(panjang);
//                                }
//                                case 2 ->                      {
//                                    System.out.print("Masukkan Panjang : ");
//                                    double panjang = input.nextDouble();
//                                    System.out.print("Masukkan Lebar : ");
//                                    double lebar = input.nextDouble();
//                                  balok = new balok(panjang, lebar);
//                                    balok.setPanjang(panjang);
//                                    balok.setLebar(lebar);
//                                }
//                                case 3 ->                      {
//                                    System.out.print("Masukkan Panjang : ");
//                                    double panjang = input.nextDouble();
//                                    System.out.print("Masukkan Lebar : ");
//                                    double lebar = input.nextDouble();
//                                    System.out.print("Masukkan Tinggi : ");
//                                    double tinggi = input.nextDouble();
//                                    balok = new balok(panjang, lebar, tinggi);
//                                    balok.setPanjang(panjang);
//                                    balok.setLebar(lebar);
//                                    balok.setTinggi(tinggi);
//                                }
//                                default -> balok = new balok();
//                            }
//                        }
//                       default -> balok = new balok();
//                    }
//                    balok.ComputeAndSetVolume();
//                   volume = balok.getVolume();
                        balok[] arraybalok = new balok[10]; // misalnya array berukuran 10
                        double ratavol = 0.0;

                        for (int i = 0; i < arraybalok.length; i++) {
                            arraybalok[i] = new balok();
                            arraybalok[i].ComputeAndSetVolume();
                        }
                        for (balok setiapbalok : arraybalok){
                            volume += setiapbalok.getVolume();
                        }
                        volume = arraybalok.length;
                        System.out.println("Rata-Rata Volume = " + ratavol);
                        break;
                        }
                
                case 3 -> {
                    tabung tabung;
                    switch (pilihanangka){
                        case 1 -> {
                            System.out.println("Pilih Macam Inputan");
                            System.out.println("1. Radius ( T = rad)");
                            System.out.println("2. Radius, Tinggi");
                            System.out.println("3. Auto (default = 5)");
                            System.out.print("Pilihan (1/2/3): ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1 ->                      {
                                    System.out.print("Masukkan Radius : ");
                                    double radius = input.nextDouble();
                                    tabung = new tabung(radius);
                                    tabung.SetRadius(radius);
                                    }
                                case 2 ->                      {
                                    System.out.print("Masukkan radius : ");
                                    double radius = input.nextDouble();
                                    System.out.print("Masukkan tinggi : ");
                                    double tinggiT = input.nextDouble();
                                    tabung = new tabung(radius, tinggiT);
                                    tabung.SetRadius(radius);
                                    tabung.SetTinggi(tinggiT);
                                    }
                                default -> tabung = new tabung();
                            }
                            }
                        default -> tabung = new tabung();
                    }
                    tabung.ComputeAndSetVolume();
                    volume = tabung.GetVolume();
                    break;
                }
                case 4 -> {
                    limas limas;
                    switch (pilihanangka){
                        case 1 -> {
                            System.out.println("Pilih Variasi Input");
                            System.out.println("1. Sisi (tinggi = sisi)");
                            System.out.println("2. Sisi, Tinggi");
                            System.out.println("3. Auto (default = 5)");
                            System.out.print("Pilihan (1/2/3) : ");
                            pilihan = input.nextInt();
                            switch (pilihan) {
                                case 1 ->                      {
                                    System.out.print("Masukkan sisi : ");
                                    double sisiL = input.nextDouble();
                                    limas = new limas(sisiL);
                                    limas.SetSisi(sisiL);
                                    }
                                case 2 ->                      {
                                    System.out.print("Masukkan sisi : ");
                                    double sisiL = input.nextDouble();
                                    System.out.print("Masukkan tinggi : ");
                                    double tinggiL = input.nextDouble();
                                    limas = new limas(sisiL, tinggiL);
                                    limas.SetSisi(sisiL);
                                    limas.SetTinggi(tinggiL);
                                    }
                                    default -> limas = new limas();
                                }
                         }
                        default -> limas = new limas();
                    }
                    limas.ComputeAndSetVolume();
                    volume = limas.GetVolume();
                    break;
                }
                    
            
                case 5 -> {
                    bola bola;
                    switch (pilihanangka){
                        case 1 -> {
                            System.out.print("Masukkan radius : ");
                            double radiusB = input.nextDouble();
                            bola = new bola(radiusB);
                            bola.SetRadius(radiusB);
                            }
                        default -> bola = new bola();
                    }
                    bola.ComputeAndSetVolume();
                    volume = bola.GetVolume();
                    break;
                }
                    }
//            System.out.println("==== HASIL PERHITUNGAN ====");
//            System.out.println("Volume = " + volume);
//            System.out.println("===========================");
            }
            
    }
}