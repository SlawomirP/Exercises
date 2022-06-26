public class Person {
    private Animal animal;
    public void nameOfYourAnimal() {
        if (animal != null) { // jeżeli zwierze różne od null to
            // wywołujemy metodę z introduceYourself
            animal.introduceYourself();

        } else {
            System.out.println("I haven't animal yet.");
        }
    }
    public void adoptAnimal(Animal animal) {
        this.animal = animal;
    }
}
