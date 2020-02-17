/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_pbo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {
    private static final Scanner s = new Scanner(System.in);

    public static void BalokMenu(){
        double p, l, t;
        double luasBalok, volBalok;
        
        Scanner scanInput = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME BALOK");
        
        System.out.print("Panjang: ");
        p = scanInput.nextDouble();
        System.out.print("Lebar: ");
        l = scanInput.nextDouble();
        System.out.print("Tinggi: ");
        t = scanInput.nextDouble();
        
        luasBalok = 2 * p * l + 2 * p * t + 2 * l * t;
        volBalok = p * l * t;
        
        System.out.println("Luas Permukaan Balok = " + luasBalok);
        System.out.println("Volume Balok = " + volBalok);
    }
    
    
    public static void KerucutMenu() {
        double r, t, p;
        final double PHI = 3.14;
        double luasKerucut, volKerucut;
        
        Scanner scanInput = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME KERUCUT");
        System.out.print("Jari-jari: ");
        r = scanInput.nextDouble();
        System.out.print("Tinggi: ");
        t = scanInput.nextDouble();
        System.out.print("Panjang Garis Pelukis/Selimut: ");
        p = scanInput.nextDouble();
        
        luasKerucut = (PHI * r * r) + (PHI * r * p);
        volKerucut = 1/3 * (PHI * r * r) * t;
        
        System.out.println("Luas Permukaan Kerucut = " + luasKerucut);
        System.out.println("Volume Kerucut = " + volKerucut);
    }
    
    public static void LimasSegitigaMenu(){
        double p, l, t;
        double luasLimasSegitiga, volLimasSegitiga;
        String kembali = "y";
        while (kembali.equals("y"))
        {
        
            Scanner scanInput = new Scanner(System.in);
        
        System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME LIMAS SEGITIGA");
        System.out.print("Panjang: ");
        p = scanInput.nextDouble();
        System.out.print("Lebar: ");
        l = scanInput.nextDouble();
        System.out.print("Tinggi: ");
        t = scanInput.nextDouble();
        
        luasLimasSegitiga = 1/3 * (1/2 * p * l) * t;
        volLimasSegitiga = 1/2 * (p*l) * 4;
        
        System.out.println("Luas Permukaan Limas Segitiga = " + luasLimasSegitiga);
        System.out.println("Volume Limas Segitiga = " + volLimasSegitiga);
    }
}