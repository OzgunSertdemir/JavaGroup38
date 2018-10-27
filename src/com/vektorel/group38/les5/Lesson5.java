package com.vektorel.group38.les5;

public class Lesson5 {

    /*
        Switch-case
        while , do-while
     */

    public void birlerYazdir(int deger){
        if (deger==1)
            System.out.println("Bir");
        if (deger==2)
            System.out.println("İki");
        if (deger==3)
            System.out.println("Üç");
        if (deger==4)
            System.out.println("Dört");
        if (deger==5)
            System.out.println("Beş");
    }

    public void basitSwCase(int x) {
        switch (x) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
        }
    }

    public void basitWhileDongusu(){
        while (true){
            System.out.println("Yaz");
        }
    }

    public void basitWhileDongusu2(){
        int deger =0;
        //-------------------------------
        while (deger<10){
            System.out.println("Yaz");
            deger++;
        }
        //-------------------------------
       /* for (int i = 0; i<10 ;i++){
            System.out.println("Yaz");
        }*/
        //-------------------------------
    }

    public void basitWhileDongusu3(){
        int deger =0;
        do{
            System.out.println("Yaz");
            deger++;
        }while (deger<10);
    }
}
