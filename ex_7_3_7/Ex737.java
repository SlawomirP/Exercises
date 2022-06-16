package ex_7_3_7;

//7.3.7 Zadania do zwracania wartości
//        7.3.7.1 Metoda podnosząca do sześcianu
//        Napisz metodę, która zwróci liczbę przesłaną jako argument podniesioną do sześcianu.
//        7.3.7.2 Metoda wypisująca gwiazdki
//        Napisz metodę, która wypisze podaną liczbę gwiazdek (znak *) na ekran.

import java.util.Scanner;

public class Ex737 {
    public static void main(String[] args) {

        System.out.println("Write your number ...");
        System.out.println("Cube of your number is " + cubeOfANumber(getInt()));

        System.out.println("Write a number of stars ...");
        stars(getInt());
    }

    static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    static int cubeOfANumber(int a ){
        return a * a * a;
    }

    static void stars (int a){
        for (int i = 1 ; i <= a; i++){
            System.out.print("*");
        }
    }


}
