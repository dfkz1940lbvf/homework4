package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int a = 0;
        while (a <= 10) {
            System.out.print(" " + a);
            a = a + 1;
        }
        System.out.println(" ");
        for( int b = 10;  b >= 0; b --) {
        System.out.print(" " + b);}
        System.out.println(" ");
        System.out.println(" Задача 2");
        int Friday = 7;
        while (Friday <= 31) {
        System.out.println(" Сегодня пятница " + Friday + "-е число. Необходимо подготовить отчет");
        Friday = Friday + 7;}
        System.out.println(" Задача 3");
        int begining = 0;
        int Year = 2022;
        int Yearbegining = 1822;
        int Yearend = 2122;
        System.out.println(" годы появления кометы ");
            while (begining <= Yearend){
                if(begining >= Yearbegining)
                System.out.println( begining );
            begining = begining + 79;

        }




	// write your code here
    }
}
