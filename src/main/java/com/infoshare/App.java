package com.infoshare;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        printString(hello("Grégòr"));

        printString("\n======== 4 attributes ========\n");

        Pies pies1 = new Pies("Kundel", "Guapo", 13, 0.60);
        Pies pies2 = new Pies("Pudel", "Bunia", 10, 0.40);
        Pies pies3 = new Pies("Labrador", "Pepa", 24, 0.80);

        printString(pies1.szczekaj());
        printString(pies2.szczekaj());
        printString(pies3.szczekaj());

        printString("------------------------");

        printDouble(pies1.getBmi());
        printDouble(pies2.getBmi());
        printDouble(pies3.getBmi());

        printString("\n========= 3 attributes ========\n");

        Pies pies4 = new Pies("Wilczur", "Duży", 28);

        printString(pies4.szczekaj());

        printString("------------------------");

        printDouble(pies4.getBmi());


        printString("\n========= Default ========\n");

        Pies pies5 = new Pies();

        printString(pies5.szczekaj());

        printString("------------------------");

        printDouble(pies5.getBmi());

        printString("\n========= Dziedziczenie ========\n");

        Suka suka1 = new Suka("Collie", "Sunia", 16, 0.80);
        PiesSamiec samiec1 = new PiesSamiec("Bokser", "Duduś", 13, 0.60);

        printString(suka1.szczekaj());
        printString(samiec1.szczekaj());

        printString("------------------------");

        printString(suka1.kupa());
        printString(samiec1.kupa());

        samiec1.setSiersc("łaciaty");
        printString(samiec1.getSiersc());


        printString("\n========= Polimorfizm ========\n");

        Wataha wat1 = new Wataha();
        Pies p1 = new Pies();
        Suka s1 = new Suka("Kundel", "Atka", 10, 0.90);
        PiesSamiec sam1 = new PiesSamiec("Terier", "Skobel", 12, 0.6);

        wat1.AddPies(p1);
        wat1.AddPies(s1);
        wat1.AddPies(sam1);

        printString(wat1.ktoWStadzie());


    }

    public static String hello(String name) {
        return "Witaj " + name + "!";
    }

    public static void printString(String text) {
        System.out.println(text);
    }

    public static void printDouble(Double numer) {
        System.out.println(String.format("%.1f", numer));
    }


}
