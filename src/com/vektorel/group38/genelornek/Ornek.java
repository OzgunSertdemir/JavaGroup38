package com.vektorel.group38.genelornek;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek {

    List<Rehber> rehberList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String sifreDosyasi = "C:\\taner\\rehber\\sifre.txt";
    String rehberDosyasi = "C:\\taner\\rehber\\rehber.txt";

    /**
     * 1 - Sistemde tek tip kullanıcı vardır, admin
     * a) kullanıcının şifresi şifrelenmiş olarak tutulmalıdır.
     * b) kullanıcı şifresini değiştirebilmelidir.
     * 2 - Basit bir rehber uygulaması yapılacak
     * 3 - Rehber uygulamasında (ad,soyad,email,adres,telefon) bilgileri olacaktır.
     * 4 - Rehber de  kişi ekleme /güncelleme / silme menüleri olacaktır.
     * 5 - Arama işlemleri yapılabilmelidir. (ad,soyad,numara)
     * 6 - Kullanıcı uygulama verilerini kaybetmemelidir.
     */


    public static void main(String[] args) {
        Ornek ornek = new Ornek();
        ornek.loginKontrol();
    }


    public void loginKontrol() {
        System.out.println("Hoşgeldiniz.");
        System.out.println("Kullanıcı Adınızı Giriniz :");
        String username = scanner.nextLine();
        System.out.println("Kullanıcı Şifrenizi Giriniz :");
        String password = scanner.nextLine();

        String icerik = dosyadanIcerikGetir(sifreDosyasi);

        if (icerik == null || icerik.length() < 1) {
            String sifreliPass = sifrele(password);
            icerigiDosyayaYaz(sifreDosyasi, sifreliPass);
        } else if (username.equals("admin") && password.equals(sifreCoz(icerik))) {
            menu();
        } else {
            System.out.println("Kullanıcı Adı vea Şifre Hatalı");
        }

    }

    public void menu() {
        kisileriYukle();
        while (true) {
            System.out.println("Kişileri ;");
            System.out.println("            Listelemek için 1");
            System.out.println("            Silmek için 2");
            System.out.println("            Arama için 3");
            System.out.println("            Ekleme için 4");
            System.out.println("Çıkış için 5 giriniz");

            int giris = scanner.nextInt();
            switch (giris) {
                case 1:
                    listele();
                    break;
                case 2:
                    silme();
                    break;
                case 3:
                    arama();
                    break;
                case 4:
                    ekleme();
                    break;
                case 5:
                    kisilerinSonHaliniKaydet();
                    System.exit(0);
                    break;
            }
        }
    }

    private void listele() {
        System.out.println("-----------Rehber Detayları---------------");
        for (Rehber r : rehberList) {
            System.out.println("Adı : " + r.getAd());
            System.out.println("Soyadı : " + r.getSoyad());
            System.out.println("Email : " + r.getEmail());
            System.out.println("Telefon : " + r.getTelefon());
            System.out.println("Adres : " + r.getAdres());
        }
        System.out.println("------------------------------------------");
    }

    private void silme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Rehber Kişi Sil---------------");
        System.out.println(" Silmek istediğiniz kişinin telefonunu giriniz ");
        String tel = sc.nextLine();
        Rehber r = rehberList.stream().filter(t->t.getTelefon().equals(tel)).findFirst().get();
        rehberList.remove(r);
        System.out.println("------------------------------------------");
    }

    private void arama() {
    }

    private void ekleme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Rehber Kişi Ekle---------------");
        System.out.println("Adı Giriniz ");
        String adi = sc.nextLine();
        System.out.println("Soyadı Giriniz ");
        String soyad = sc.nextLine();
        System.out.println("Email Giriniz ");
        String email = sc.nextLine();
        System.out.println("Telefon Giriniz ");
        String tel = sc.nextLine();
        System.out.println("Adres Giriniz ");
        String adres = sc.nextLine();

        Rehber r=new Rehber();
        r.setAd(adi);
        r.setTelefon(tel);
        r.setAdres(adres);
        r.setEmail(email);
        r.setSoyad(soyad);
        rehberList.add(r);

        System.out.println("------------------------------------------");
}

    private void kisilerinSonHaliniKaydet() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Rehber r : rehberList) {
            stringBuilder.append(r.getAd() + "@#" + r.getSoyad() + "@#" + r.getEmail() + "@#" + r.getAdres() + "@#" + r.getTelefon() + "###");
        }
        icerigiDosyayaYaz(rehberDosyasi, stringBuilder.toString());
    }

    private void kisileriYukle() {
        String icerik = dosyadanIcerikGetir(rehberDosyasi);

        String[] satirlar = icerik.split("###");
        for (String st : satirlar) {
            if (st.contains("@#")) {
                String[] detaylar = st.split("@#");
                if (detaylar.length == 5) {
                    Rehber rehber = new Rehber();
                    rehber.setAd(detaylar[0]);
                    rehber.setSoyad(detaylar[1]);
                    rehber.setEmail(detaylar[2]);
                    rehber.setAdres(detaylar[3]);
                    rehber.setTelefon(detaylar[4]);
                    rehberList.add(rehber);
                }
            }
        }
    }

    public String dosyadanIcerikGetir(String dosyaAdi) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File file = new File(dosyaAdi);
            if (!file.exists()) {
                file.createNewFile();
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public void icerigiDosyayaYaz(String doyaAdi, String icerik) {
        try {
            File file = new File(doyaAdi);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(doyaAdi, false));
            writer.append(icerik);
            writer.close();
        } catch (Exception e) {

        }
    }

    public String sifrele(String sifre) {
        String sifreliHali = "";
        for (int i = 0; i < sifre.length(); i++) {
            int deger = sifre.codePointAt(i);
            //deger++;
            if (deger % 2 == 0)
                deger = deger + 3;
            else
                deger = deger - 3;
            sifreliHali += (char) deger;
        }
        return sifreliHali;
    }

    public String sifreCoz(String sifreliHali) {
        String icerik = "";
        for (int i = 0; i < sifreliHali.length(); i++) {
            int deger = sifreliHali.codePointAt(i);
            //deger++;
            if (deger % 2 == 0)
                deger = deger + 3;
            else
                deger = deger - 3;
            icerik += (char) deger;
        }
        return icerik;
    }
}
