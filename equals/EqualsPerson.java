package equals;

public class EqualsPerson {

    private String name;
    private String surname;
    private int age;

    public EqualsPerson(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean equals(Object o){
        EqualsPerson newP = (EqualsPerson) o;
        return this.name.equals(newP.name) && this.surname.equals(newP.surname) && this.age == newP.age;
    }

    public static void main(String[] args) {

        EqualsPerson o1 = new EqualsPerson("Jan", "Nowak", 25);
        EqualsPerson o2 = o1;
        EqualsPerson o3 = new EqualsPerson("Jan", "Nowak", 25);

//        if (o1 == o2){
//            System.out.println("o1 == o2");
//        } else {
//            System.out.println("o1 != o2");
//        }
//        if (o1 == o3){
//            System.out.println("o1 == o3");
//        } else {
//            System.out.println("o1 != o3");
//        }
        if (o1.equals(o2)){
            System.out.println("o1 == o2");
        } else {
            System.out.println("o1 != o2");
        }
        if (o1.equals(o3)){
            System.out.println("o1 == o3");
        } else {
            System.out.println("o1 != o3");
        }


    }
}
