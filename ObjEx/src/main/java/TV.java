public interface TV {

    // wlaczenie tv
    void onTv ();

    // wylaczenie
    void offTv ();

    // przlączenie na konkretny program, dodajemy parametr
    void changeProg (int number);

    void powerStat();
}
