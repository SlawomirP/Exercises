package equals;

public class CoordinatesEqualsEx {

    private int x,y;

    public CoordinatesEqualsEx (int x, int y) {
    this.x = x;
    this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }

    public static void main(String[] args) {

        CoordinatesEqualsEx w1 = new CoordinatesEqualsEx(10, 20);
        CoordinatesEqualsEx w2 = w1;
        CoordinatesEqualsEx w3 = new CoordinatesEqualsEx(1, -5);

        w3.setX(10);
        w3.setX(20);

        if (w1 == w2){
            System.out.println("w1 == w2");
        } else {
            System.out.println("w1 != w2");
        }
        if (w1 == w3){
            System.out.println("w1 == w3");
        } else {
            System.out.println("w1 != w3");
        }

        // how to compare objects
    }

}
