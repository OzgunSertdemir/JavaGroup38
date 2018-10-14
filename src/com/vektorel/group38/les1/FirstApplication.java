package com.vektorel.group38.les1;


import com.vektorel.group38.les2.Lesson2;

public class FirstApplication {

    public static void main(String[] args) {
        System.out.println("Hello World Application");

        Lesson2 lesson2 =new Lesson2();
        lesson2.exampleMethod();

        lesson2.exampleMethod(45);

        lesson2.exampleMethod("Ahmet" );

    }

}
