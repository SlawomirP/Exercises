package ex7_7_5;

//        1. Metoda zwracająca ostatni znak
//        Napisz metodę, która zwróci ostatni znak w przesłanym jako argument stringu.
//
//        Dla przykładu, dla argumentu "Witaj", metoda powinna zwrócić literę j.
//
//        2.Metoda czyPalindrom
//        Napisz metodę, która odpowiada na pytanie, czy podany string jest palindromem. Palindromy to słowa, które są takie same czytane od początku i od końca, np. kajak.
//                Dla przykładu, dla argumentu "kajak" (a także "Kajak"), metoda ta powinna zwrócić true, a dla argumentu "kot" – false.
//
//        3. Metoda sumująca liczby w tablicy
//                Napisz metodę, która przyjmuje tablicę liczb całkowitych i zwraca sumę wszystkich elementów tej tablicy.
//
//                Dla przykładu, dla tablicy o elementach { 1, 7, 20, 100 } metoda powinna zwrócić liczbę 128.
//
//        4. Metoda zliczająca znak w stringu
//                Napisz metodę, która przyjmuje jako argument string i znak (char) i zwraca liczbę równą liczbie wystąpień podanego znaku w danym stringu.
//
//                Dla argumentów: "Ala ma kota", 'a', metoda powinna zwrócić 3, ponieważ string zawiera trzy małe litery a. Uwaga: znaki zapisujemy w apostrofach, a stringi w cudzysłowach. Przykładowe wywołanie metody, którą należy napisać w tym zadaniu:
//
//                int liczbaLiterA = zliczWystapienia("Ala ma kota", 'a');

import java.util.Scanner;

public class Ex7_7_5 {
    public static void main(String[] args) {
        System.out.println("Write word ...");
        System.out.println("Last letter in your word is " + getLast(getString()) + ".");
    }

    static char getLast (String word){
        return word.charAt(word.length() - 1);
    }
    static String getString(){
       return new Scanner(System.in).nextLine();
    }
}
