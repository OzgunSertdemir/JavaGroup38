package com.vektorel.group38.les5;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Lesson5 lesson5 = new Lesson5();
        lesson5.basitWhileDongusu2();

    }
}

/**
 * Lesson5 lesson5 = new Lesson5();
 * Random random =new Random();
 * <p>
 * <p>
 * Long swCase = System.currentTimeMillis();
 * for (int i = 0; i<1000;i++) {
 * lesson5.basitSwCase(random.nextInt(5));
 * }
 * Long zamanFarkSwCase = System.currentTimeMillis() - swCase;
 * <p>
 * Long ifElse = System.currentTimeMillis();
 * for (int i = 0; i<1000;i++) {
 * lesson5.birlerYazdir(random.nextInt(5));
 * }
 * Long zamanFarkIfElse = System.currentTimeMillis() - ifElse;
 * <p>
 * System.out.println(zamanFarkSwCase);
 * System.out.println(zamanFarkIfElse);
 **/