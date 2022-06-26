public class Pilot implements PilotTv{
    @Override
    public void pairing(TV tv) {
        this.tv = tv; // ten obiekt został przypisany do metody
        System.out.println("Paring with " + tv + " completed.");
    }
    TV tv; // tworzymy obiekt bo na nim bedsziemy dzialac
    @Override
    public void redButton() {
    tv.powerStat();
    }

    @Override
    public void button1() {
    tv.changeProg(1);
    }

    @Override
    public void button2() {
tv.changeProg(2);
    }

    @Override
    public void button3() {
tv.changeProg(3);
    }



}
