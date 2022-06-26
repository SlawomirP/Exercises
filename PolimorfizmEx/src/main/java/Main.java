public class Main {
    public static void main(String[] args) {

////      Dog dog = new Dog();
////      Animal animal = new Dog("Rex");
//        Mammal animal = new Dog("Rex");
//        animal.animalSound();
//
//        // pod animal podkładamy horse, wywołujemy tą samą metodę
//        // pod animal mozemy podstawic obiekty klas ktore implementuja ten interfejs
//        animal = new Horse("Buddy");
//        animal.animalSound();

        // tworzymy osobę oraz zwierzątka
        Person tom = new Person();
        Dog dog = new Dog("Rex");
        Horse horse = new Horse("Buddy");

        // na osobie wywołujemy metody z person
        tom.adoptAnimal(horse);
        tom.nameOfYourAnimal();
        // mozemy wywoływać te same metody na różnych obiektach
    }
}
