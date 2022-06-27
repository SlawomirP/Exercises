public abstract class TvGeneral implements TvOn, TvOff {

    private String name;
    private String color;

    public TvGeneral(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public abstract void tvOff();

    @Override
    public abstract void tvOn();

    protected String getName() {
        return name;
    }

    protected String getColor() {
        return color;
    }

    public String toString () {
        return "Telewizor " + name + " o kolorze " + color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
