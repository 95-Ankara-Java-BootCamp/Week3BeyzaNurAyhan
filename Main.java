package com.egitim.ücüncühafta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            UcakRezervasyonSistemi thy = new THYRezervasyonSistemi(10);
            UcakRezervasyonSistemi pegasus = new PegasusRezervasyonSistemi(10);
            int satis;
            while(true) {
                System.out.println("THY Rezervasyon Sistemine Hoş Geldiniz!");
                System.out.println("THY'dan bilet almak icin 1'e basınız:");
                System.out.println("Pegasus'dan bilet almak icin 2'ye basınız:");
                System.out.println("Çıkış için 3 'e basınız:");
                satis = scanner.nextInt();

                switch (satis) {

                    case 1:
                        thy.rezervasyonAl();

                        break;
                    case 2:
                        pegasus.rezervasyonAl();
                        break;
                    case 3:
                        System.out.println("Yine bekleriz..");
                        break;
                }
            }
    }
}
