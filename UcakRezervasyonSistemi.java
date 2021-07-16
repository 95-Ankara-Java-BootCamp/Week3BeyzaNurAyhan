package com.egitim.ücüncühafta;

import java.util.Scanner;

public abstract class UcakRezervasyonSistemi {
    Scanner scanner = new Scanner(System.in);
    private int koltukSayisi = 10;
    protected boolean[] koltuklar;

    public UcakRezervasyonSistemi(){
        setKoltukSayisi(koltukSayisi);
    }

    public UcakRezervasyonSistemi(int koltukSayisi) {
        if (koltukSayisi < 10) {
            System.out.println("Koltuk sayısı minimum 10 olmalıdır.");
            this.koltukSayisi = 10;
        } else {
            this.koltukSayisi = koltukSayisi;
        }

        this.koltuklar = new boolean[this.koltukSayisi];
    }

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    public boolean ekonomiDoluMu() {
        for (int i = 5; i < koltuklar.length; i++) {
            if (koltuklar[i] == false) {
                System.out.println("Ekonomi sınıfımızda boş koltuklarımız mevcuttur.");
                return false;
            }
        }
        System.out.println("Ekonomi sınıfımızda boş koltuk kalmamıştır");
        return true;
    }

    public boolean businessDoluMu() {
        for (int i = 0; i < 5; i++) {
            if (koltuklar[i] == false) {
                System.out.println("Business sınıfımızda boş koltuklarımız mevcuttur.");
                return false;
            }
        }
        System.out.println("Business sınıfımızda boş koltuk kalmamıştır");
        return true;
    }

    public boolean ucakDoluMu() {
        if (businessDoluMu() == true && ekonomiDoluMu() == true) {
            System.out.println("Uçağımızda boş koltuk kalmamıştır.");
            return true;
        }
        System.out.println("Uçağımızda boş koltuklarımız mevcuttur.");
        return false;
    }

    public abstract void rezervasyonAl();

}
