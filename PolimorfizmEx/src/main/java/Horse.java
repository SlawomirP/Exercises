public class Horse extends Mammal {

    public Horse(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("iha iha iha");
    }
    @Override
    public void introduceYourself() {
        System.out.println("I'm horse " + name);
    }
}
