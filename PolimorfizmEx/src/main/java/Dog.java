public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalSound() {
        System.out.println("hau hau hau");
    }
    @Override
    public void introduceYourself() {
        System.out.println("I'm dog " + name);
    }
}
