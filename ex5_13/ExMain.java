package ex5_13;

//5.13 Zadania
//        5.13.1 While i liczby od 1 do 10
//        Napisz program z użyciem pętli while , który wypisuje wszystkie liczby od 1 do 10 (włącznie),
//        oddzielone przecinkami, poza liczbą 10 , po której nie powinno być przecinka.
//        5.13.2 Policz silnię
//        Napisz program, który policzy i wypisze silnię liczby, którą poda użytkownik. Silnia to iloczyn
//        kolejnych liczb całkowitych od 1 do danej liczby, np. silnia 5 to 1 * 2 * 3 * 4 * 5 , czyli 120 .
//        Silnia liczby 0 to 1 .
//        5.13.3 Palindrom
//        Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest palindromem.
//        Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.
//        5.13.4 Wypisz największą liczbę z podanych
//        Napisz program, który z liczb podanych przez użytkownika wypisze największą. Program po
//        pobraniu każdej liczby powinien pytać, czy użytkownik chce podać kolejną liczbę. Po podaniu
//        liczb, program powinien wypisać największą z nich.
//        5.13.5 Zagnieżdżone pętle
//        Napisz program z dwoma pętlami (jedna zagnieżdżona w drugiej), każda z pętli powinna iterować
//        od 1 do 10 .
//        1. Pętla główna powinna pomijać swoje iteracje za pomocą instrukcji continue , gdy jej
//        zmienna jest nieparzysta.
//        2. Pętla zagnieżdżona powinna wypisywać wartość swojej zmiennej. Następnie, gdy zmienna
//        pętli zagnieżdżonej jest większa od zmiennej pętli głównej, pętla zagnieżdżona powinna
//        spowodować, że przejdziemy do kolejnej iteracji pętli głównej (w tym przypadku skorzystaj
//        z etykiety i instrukcji continue ).
//        5.13.6 Kalkulator
//        Napisz program, który będzie pobierał od użytkownika liczby i działania do wykonania na nich.
//        Program powinien wypisywać wynik po każdym działaniu. Możliwe działania to:
//        • * mnożenie,
//        • / dzielenie,
//        • - odejmowanie,
//        • + dodawanie.
//        Jeżeli podane zostanie inne działanie, lub podana zostanie liczba 0 jako dzielnik podczas dzielenia,
//        program powinien wypisać stosowny komunikat i ponownie pobrać od użytkownika dane.
//        Na początku, program powinien pobrać od użytkownika dwie liczby i działanie do wykonania na
//        nich. Za każdy kolejnym razem, program powinien pobierać od użytkownika już tylko jedną liczbę
//        https://kursjava.com
//        168i działanie, po czym powinien wykonać podane działanie na poprzednim wyniku i podanej liczbie.
//        Dla przykładu:
//        1. Program pobiera najpierw dwie liczby od użytkownika: 10 i 15 , oraz działanie: dodawanie.
//        2. Program dodaje do siebie liczby i wypisuje wynik 25 na ekran.
//        3. Program pyta, czy użytkownik chce wykonać kolejne działanie.
//        a) Jeżeli nie, program kończy działanie.
//        b) Jeżeli tak, to program pobiera jedną liczbę i działanie, np. 2 i mnożenie. Program mnoży
//        poprzedni wynik działania – czyli 25 * 2 i wypisuje wynik 50 na ekran. Wracamy do
//        punktu 3. i ponownie pytamy o chęć dalszych kalkulacji.
//        5.13.7 Choinka
//        Napisz program, który pobierze od użytkownika jedną liczbę całkowitą. Następnie, program
//        powinien wypisać na ekran choinkę ze znaków *, gdzie w ostatniej linii będzie liczba gwiazdek
//        podana przez użytkownika, a w każdej powyższej o dwie gwiazdki mniej, niż w poniższej.
//        Przykład pierwszy – użytkownik podał liczbę 5 , efekt wyświetlony na ekranie:
//          *
//         ***
//        *****
//        Przykład drugi – użytkownik podał liczbę 6 , efekt na ekranie:
//          **
//         ****
//        ******

public class ExMain {
    public static void main(String[] args) {

        // 5.13.1

        int limit = 1;

        while (limit <= 10) {
            System.out.print(limit);
            if(limit < 10){
                System.out.print(", ");
            }
            limit++;
        }


    }
}
