package com.vektorel.group38.les9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek {

    String filePath = "C:\\taner\\kisiler.txt";

    public static void main(String[] args) {
        Ornek ornek = new Ornek();
        //ornek.dosyayaYazma();
        ornek.dosyadanOkuma();

    }

    public void dosyayaYazma() {
        List<Kisi> liste = new ArrayList<>();

        Kisi k1 = new Kisi();
        k1.setAd("Taner");
        k1.setSoyad("TEMEL");
        k1.setCinsiyet(Boolean.TRUE);
        liste.add(k1);

        Kisi k2 = new Kisi();
        k2.setAd("Ahmet");
        k2.setSoyad("TEMEL");
        k2.setCinsiyet(Boolean.TRUE);
        liste.add(k2);

        Kisi k3 = new Kisi();
        k3.setAd("Ayşe");
        k3.setSoyad("KARA");
        k3.setCinsiyet(Boolean.FALSE);
        liste.add(k3);

        Kisi k4 = new Kisi();
        k4.setAd("Murat");
        k4.setSoyad("TEMEL");
        k4.setCinsiyet(Boolean.TRUE);
        liste.add(k4);

        Kisi k5 = new Kisi();
        k5.setAd("Cemal");
        k5.setSoyad("TEMEL");
        k5.setCinsiyet(Boolean.TRUE);
        liste.add(k5);

        kisileriDosyayaYaz(liste);
    }

    public void kisileriDosyayaYaz(List<Kisi> kisiler) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false));
            for (Kisi k : kisiler) {
                writer.append(k.getAd() + "@" + k.getSoyad() + "@" + k.getCinsiyet());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {

        }
        System.out.println("Dosyaya Yazdım");
    }

    public void dosyaYazmaJ8(List<Kisi> kisiler) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false));
        kisiler.forEach(k -> {
            try {
                writer.append(k.getAd() + "@" + k.getSoyad() + "@" + k.getCinsiyet());
                writer.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void dosyadanOkuma() {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String satir = scanner.nextLine();
                if (satir.contains("@")) {
                    String[] d = satir.split("@");
                    System.out.println(d[0] + " " + d[1] + " " + d[2]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
