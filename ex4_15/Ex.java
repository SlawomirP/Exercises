package ex4_15;

import java.util.Scanner;


public class Ex {
    public static void main(String[] args) {
     /*   4.15.1 Czy liczba podzielna przez trzy
        Napisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez
        3 . Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia jest równa 0 , to liczba jest
        podzielna przez 3 .

        4.15.2 Czy można zbudować trójkąt
        Napisz program, który wczyta od użytkownika trzy liczby i odpowie na pytanie, czy można
        z nich zbudować trójkąt (suma każdych dwóch boków powinna być większa od trzeciego boku).

        4.15.3 Wypisz największą z dwóch liczb
        Napisz program, który pobierze od użytkownika dwie liczby i wypisze największą z nich.

        4.15.4 Wypisz największą z trzech liczb
        Napisz program, który pobierze od użytkownika trzy liczby i wypisze największą z nich.

        4.15.5 Zamień liczbę na nazwę miesiąca
        Napisz program, który pobierze od użytkownika numer miesiąca i wypisze jego nazwę, lub
        komunikat "Nieprawidlowy numer miesiaca" , jeżeli podany numer będzie spoza zakresu
        1 .. 12 . Skorzystaj z instrukcji switch .

        4.15.6 Sprawdź imię
        Napisz program, który pobierze od użytkownika jego imię i odpowie na pytanie, czy jego imię jest
        takie samo, jak Twoje (załóżmy, że użytkownik podaje swoje imię bez polskich znaków).
                Uwaga! Pamiętaj, aby skorzystać z metody equals typu String zamiast porównywać stringi za
        pomocą operatora == !

                4.15.7 Czy pełnoletni
        Napisz program, który pobiera wiek od użytkownika. Zapisz w zmiennej typu boolean informację,
        czy użytkownik jest pełnoletni, czy nie. Skorzystaj z trój-argumentowego operatora warunkowego.
        Wypisz wynik zdefiniowanej zmiennej typu boolean na ekran.

        4.15.8 Czy rok przestępny
        Napisz program, który pobierze od użytkownika rok i odpowie na pytanie, czy podany rok jest
        rokiem przestępnym, czy nie. Wskazówka: rok jest rokiem przestępnym, jeżeli:
•
        dzieli się przez 4 i nie dzieli się przez 100
        lub
•
        dzieli się przez 400 .*/

        // 4.15.1

        System.out.println("Write your number...");
        int number = getInt();

        if (number % 3 == 0) {
            System.out.println("Number is divisible by 3 ");
        } else {
            System.out.println("Number isn't divisible by 3.");
        }
        System.out.println("----------------------");

        // 4.15.2

        int [] array = new int [3];

        System.out.println("Write side -a- of the triangle ");
        int aSide = getInt();
        array[0] = aSide;
        System.out.println("Write side -b- of the triangle ");
        int bSide = getInt();
        array[1] = bSide;
        System.out.println("Write side -c- of the triangle ");
        int cSide = getInt();
        array[2] = cSide;

        int maxVal = 0;

        for (int j : array) {
            if (j > maxVal) {
                maxVal = j;
            }
        }

        if(maxVal < ((aSide + bSide + cSide) - maxVal)){
            System.out.println("This can be triangle.");
        } else {
            System.out.println("We can't build triangle.");
        }
        System.out.println();

        // 4.15.3

        System.out.println("--Bigger number--");

        System.out.println("Write first number ...");
        int first = getInt();

        System.out.println("Write second number ...");
        int second = getInt();

        System.out.println("Bigger is " + compareResult(first, second));

        // 4.15.4

        System.out.println("---- The biggest ----");

        System.out.println("Write first number...");
        int firstN = getInt();
        System.out.println("Write second number...");
        int secondN = getInt();
        System.out.println("Write third number...");
        int thirdN = getInt();

        System.out.println("The biggest number is " + theBiggest(firstN,secondN,thirdN));

    }

    static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    static int compareResult (int a, int b){
        return Math.max(a, b);
    }

    static int theBiggest (int a, int b, int c) {
        int maxVal = 0;
        int [] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        for (int i : array){
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }

}
