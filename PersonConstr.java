package classEx;

public class PersonConstr {
    private String name;
    private String surname;
    private final int bornYear;
    private Adress adress;

    public PersonConstr(String name, String surname, int bornYear, Adress adress){
        this.name = name;
        this.surname = surname;
        this.bornYear = bornYear;
        this.adress = adress;
    }
    public PersonConstr(String name, String surname,int bornYear, String town, String code, String street, int houseNr){
        this.name = name;
        this.surname = surname;
        this. bornYear = bornYear;
        this.adress = new Adress(town, code, street,houseNr);
    }

    public String toString(){
        return "Name: " + name + ", surname: " + surname + ", year of born: " + bornYear + " " + adress;
    }

    public static void main(String[] args) {

        Adress adress = new Adress("Warsaw", "12-345", "Nices", 30);
        PersonConstr person1 = new PersonConstr("Billy", "Sky", 1980, adress);
        PersonConstr person2 = new PersonConstr("Julia", "Swan", 1990, "Gdansk", "21-654", "Dluga", 40);

        System.out.println(person1);
        System.out.println(person2);
    }

}
