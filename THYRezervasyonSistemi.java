package com.egitim.ücüncühafta;

import java.util.Scanner;

public class THYRezervasyonSistemi extends UcakRezervasyonSistemi{

    public THYRezervasyonSistemi(){

    }
    public THYRezervasyonSistemi(int koltukSayisi){
        super(koltukSayisi);
    }

    @Override
    public void rezervasyonAl() {
        System.out.println("THY rezervasyon sistemine hoşgeldiniz.");
        System.out.println("Business için 1'e, ekonomi için 2'ye basınız.");

        Scanner scanner = new Scanner(System.in);
        int flightType = scanner.nextInt();

        System.out.println("Rezerve etmek istediğiniz koltuk numarasını giriniz : ");
        int rezervasyonKoltukNumarasi = scanner.nextInt();

        if (rezervasyonKoltukNumarasi > getKoltukSayisi()) {
            System.out.println("Yanlış koltuk numarası girdiniz");
        } else if (ucakDoluMu()) {
            System.out.println("Ucak Doludur");
        }
        switch (flightType) {
            case 1:
                if (businessDoluMu()) {
                    System.out.println("Business doludur!");
                } else if (rezervasyonKoltukNumarasi <= 5) {
                    if (koltuklar[rezervasyonKoltukNumarasi - 1]) {
                        System.out.println("Seçtiğiniz Koltuk Doludur!");
                    } else {
                        System.out.println("Koltuk numaranız : " + rezervasyonKoltukNumarasi);
                        koltuklar[rezervasyonKoltukNumarasi - 1] = true;
                    }
                }else{
                    System.out.println("Seçtiğiniz Koltuk Numarası Business'a ait değildir.");
                }
                break;
            case 2:
                if (ekonomiDoluMu()) {
                    System.out.println("Ekonomi doludur!");
                } else if (rezervasyonKoltukNumarasi > 5) {
                    if (koltuklar[rezervasyonKoltukNumarasi - 1]) {
                        System.out.println("Seçtiğiniz Koltuk Doludur!");
                    } else {
                        System.out.println("Koltuk numaranız : " + rezervasyonKoltukNumarasi);
                        koltuklar[rezervasyonKoltukNumarasi - 1] = true;
                    }
                }else{
                    System.out.println("Seçtiğiniz Koltuk Numarası Ekonomi'ye ait değildir.");
                }
                break;
        }

    }
}
