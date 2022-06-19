package classEx;

public class Vehicle {
    private final String brand;
    private final String regNr;
    private final int prodDate;

    public Vehicle(String brand, String regNr, int prodDate){
        this.brand = brand;
        this.regNr = regNr;
        this.prodDate = prodDate;
    }

    public String toString(){
        return "Brand: " + brand + ", reistration number: " + regNr + ", produced in: " + prodDate;
    }

    public String getBrand(){
        return brand;
    }
    public String getRegNr(){
        return regNr;
    }
    public int getProdDate(){
        return prodDate;
    }
}
