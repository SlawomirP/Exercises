package equals;

public class FruitEquals {

    private String name;
    private int price;

    public FruitEquals (String name, int price){
        this.name = name;
        this.price = price;
    }

    public boolean equals(Object o){

        if (this == o) {
            return true;
        }
        if (this == null || this.getClass() != o.getClass()){
            return false;
        }

        FruitEquals fruit = (FruitEquals) o;

        if ((this.name == null && fruit.name == null) || (this.name != null && this.name.equals(fruit.name))){
            return false;
        }

        return this.price == fruit.price;
    }

}
