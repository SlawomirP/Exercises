package tdd_ex;

//        8.11.1 Testy czyParzysta
//        Napisz testy oraz metodę, która odpowiada na pytanie, czy podana liczba jest parzysta.

//        8.11.2 Testy sprawdzania znaku liczby
//        Napisz testy oraz metodę, która przyjmuje liczbę całkowitą jako argument i zwraca:
//        1. -1 , jeżeli podana liczba jest ujemna,
//        2. 0 , jeżeli podana liczba jest równa 0 ,
//        3. 1 , jeżeli podana liczba jest dodatnia.

//        8.11.3 Testy zwracania indeksu szukanego elementu
//        Napisz testy oraz metodę, która przyjmuje jako argument tablicę liczb oraz liczbę i zwraca indeks w
//        tej tablicy, pod którym znajduje się liczba podana jako drugi argument. Jeżeli podanej liczby nie ma
//        w tablicy, metoda powinna zwrócić liczbę -1 . Przykłady:
//        1. Dla argumentów { 1 , 10 , 200 , 1000 }, 200 – metoda powinna zwrócić 2 , ponieważ
//        liczba 200 jest trzecim elementem podanej tablicy, a jej indeks to 2 (bo, jak na pewno
//        pamiętamy, indeksy zaczynamy liczyć od 0 ).
//        2. Dla argumentów { 1 , 10 , 200 , 1000 }, 500 – metoda powinna zwrócić -1 , ponieważ
//        liczby 500 nie ma w podanej tablicy.
public class TddEx {
    public static void main(String[] args) {

       isEven_evenNumber_true();
       isEven_oddNumber_false();
       isEven_negativeEvenNumber_true();
       isEven_negativeOddNumber_false();
       isEven_zero_true();
       isEven_number2_true();


    }

    public static boolean isEven (int x) {
        return x % 2 == 0;
    }

    // test 1 result for even nr

    public static void isEven_evenNumber_true (){
        int number = 4;
        boolean result = isEven(number);
        assertEquals(true, result);
    }

    // test 2 for odd nr

    public static void isEven_oddNumber_false (){
        int number = 5;
        boolean result = isEven(number);
        assertEquals(false, result);
    }

    // test 3 for nr 2

    public static void isEven_number2_true (){
        int x = 2;
        boolean result = isEven(x);
        assertEquals(true, result);
    }

    // test 4 for a negative even number

    public static void isEven_negativeEvenNumber_true (){
        int x = -2;
        boolean result = isEven(x);
        assertEquals(true, result);
    }

    // test 5 for a negative odd number

    public static void isEven_negativeOddNumber_false (){
        int x = -3;
        boolean result = isEven(x);
        assertEquals(false, result);
    }

    // test 6 for nr 0

    public static void isEven_zero_true (){
        int x = 0;
        boolean result = isEven(x);
        assertEquals(true, result);
    }


    public static void assertEquals(boolean expect, boolean actual){
        if (expect != actual) {
            System.out.println("Should be " + expect + ", is " + actual + "!!!");
        }
    }

}
