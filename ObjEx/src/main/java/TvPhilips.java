public abstract class TvPhilips implements TV {

    private boolean onStatus = false;
    private int programNumber = 3;

    private int cale;
    private String id;

    protected TvPhilips(String id, int cale) {
        this.cale = cale;
        this.id = id;
    }

    public int getCale() { // metoda dodatkowa, zwracajaca cale
        return cale;
    }

    @Override
    public void onTv() {
        onStatus = true;
        System.out.println("Welcome");
        signalEmiting();
    }

    @Override
    public void offTv() {
        onStatus = false;
        System.out.println("BlackScreen");

    }

    @Override
    public void changeProg(int number) {
        if (onStatus) {
            programNumber = number;
        }
    }

    // metoda symulujaca sygnal
    private void signalEmiting (){
        new Thread(new Runnable() {
            @Override
            public void run() { // dopoki wlaczony (onCondition jest true) to dziala
                while (onStatus){ // bedzie wyswietlany program, to tworzymy zmienna
                    try {
                        System.out.println("program " + programNumber); // zawierającą nr programu
                        Thread.sleep(3000);  // dajemy opoznienie zeby cigle nie wyswietlalo
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    public void powerStat() { // metoda do pilota na redButton
        if (onStatus) {
            offTv();
        } else {
            onTv();
        }
    }
}
