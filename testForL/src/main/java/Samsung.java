public class Samsung extends TvGeneral{

    public Samsung(String name, String color) {
        super(name, color);
    }

    @Override
    public void tvOff() {
        System.out.println("Wylaczam tv " + getName());
    }

    @Override
    public void tvOn() {
        System.out.println("Wlaczam tv " + getName());
    }


}
