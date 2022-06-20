package equals;

//        Napisz klasę Punkt, która będzie zawierała punkt na płaszczyźnie opisany przez dwie wartości x
//        oraz y (pola typu int). Napisz konstruktor inicjalizujący pola x i y, a także zaimplementuj metodę
//        equals. Sprawdź, czy metoda działa zgodnie z założeniami.

public class PointEquals {
    private int x, y;
    public PointEquals (int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals (Object o){
        // reference
        if (this == o) {
            return true;
        }
        // null and class
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        // points compare
        
        PointEquals testPoint = (PointEquals) o;
        if(this.x != testPoint.x){
            return false;
        }
        return this.y == testPoint.y;
    }
    public static void main(String[] args) {
        PointEquals firstPoint = new PointEquals(5, 6);
        PointEquals secondPoint = new PointEquals(4, 4);
        PointEquals thirdPoint = firstPoint;
        PointEquals fourthPoint = new PointEquals(6, 5);

        System.out.println(firstPoint);
        System.out.println(secondPoint);
        System.out.println(thirdPoint);

        System.out.println("Equals---------------");
        System.out.println("1 vs 2 " + firstPoint.equals(secondPoint));
        System.out.println("1 vs 3 " + firstPoint.equals(thirdPoint));
        System.out.println("1 vs 4 " + firstPoint.equals(fourthPoint));
        System.out.println("1 vs null " + firstPoint.equals(null));

    }

}
