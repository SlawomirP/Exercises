public abstract class TvSamsung implements TV {
    // implementacja metod z interfejsu TV
    // dodajemy zmienna z której bedziemy brac info czy tv jest wlaczony czy wylaczony

    private boolean onCondition = false; // stan wylaczony
    private int programNumber = 1;
    private int cale; // to przy tworzeniu tv odrazu bedzie w konstruktorze

    protected TvSamsung(int cale) {
        this.cale = cale;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @Override
    public void onTv() {
        onCondition = true; // stan przelacza sie na true-wlaczony
        System.out.println("SAMSUNG TV");//text powitalny
        displayScreen(); // metoda ktora cos wyswietla, napisana nizej
    }
    //----------------------------------------------------------------
    // jakas metoda symulujaca wyswietlanie obrazu, tylko dla samsunga
    private void displayScreen (){
        // damy tu jakis niezalezny watek, cos tam wyswietlajacy
        new Thread(new Runnable() {
            @Override
            public void run() { // dopoki wlaczony (onCondition jest true) to dziala
                while (onCondition){ // bedzie wyswietlany program, to tworzymy zmienna
                    try {
                        System.out.println("Display program " + programNumber); // zawierającą nr programu
                        Thread.sleep(3000);  // dajemy opoznienie zeby cigle nie wyswietlalo
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    @Override
    public void offTv() {
        // wyswietlenie jakiejs animacji wyłączającej tv
        System.out.println("Tv is turning off");
        onCondition = false;  // po wylaczeniu ustawiamy zmienna od stanu na false
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @Override
    public void changeProg(int number) {
        // po przelaczeniu kanalu nastepuje przestawienie nr kanalu na inny czyli modyfikujemy zmienna
        if (onCondition) {  // przypisujemy tu nr uzyskany w parametrze, bierzemy pod uwage ze tv musi byc wlaczony
            programNumber = number;
        }
    }

    public void powerStat() { // metoda do pilota na redButton
        if (onCondition){
            offTv();
        }else{
            onTv();
        }

    }
}
