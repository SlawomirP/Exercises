package classEx;

public class Adress {
    private String town;
    private String code;
    private String street;
    private int houseNr;

    public Adress (String town, String code, String street, int houseNr){
        this. town = town;
        this. code = code;
        this. street = street;
        this.houseNr = houseNr;
    }

    public String toString (){
        return "Town: " + town + ", code: "+ code + ", name of the street: " + street +", house number: " + houseNr + ".";
    }
}
