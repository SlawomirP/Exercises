package equals;

//        Napisz klasę Figura, która będzie zawierała tablicę obiektów typu Punkt. Pole z tablicą nazwij
//        wierzcholki. Napisz konstruktor inicjalizujący pole wierzcholki, a także zaimplementuj metodę
//        equals dla klasy Figura. Skorzystaj z metody Arrays.equals do porównania tablic.

import java.util.Arrays;
public class FigureEquals {
    private PointEquals [] vertex;
    public FigureEquals (PointEquals [] vertex) {
        this.vertex = vertex;
    }
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        FigureEquals tab = (FigureEquals) o;
        return Arrays.equals(this.vertex, tab.vertex);
    }

    public static void main(String[] args) {

        FigureEquals figureOne = new FigureEquals(new PointEquals[]{
            new PointEquals(-1,1), new PointEquals(1,1),
                new PointEquals(1,-1), new PointEquals(-1,-1)
        });
        FigureEquals figureTwo = new FigureEquals(new PointEquals[]{
                new PointEquals(-1,1), new PointEquals(1,1),
                new PointEquals(1,-1), new PointEquals(-1,-1)
        });
        FigureEquals figureThree = new FigureEquals(new PointEquals[]{
                new PointEquals(-2,2), new PointEquals(2,2),
                new PointEquals(2,-2), new PointEquals(-2,-2)
        });

        System.out.println(figureOne);
        System.out.println(figureTwo);
        System.out.println(figureThree);
        System.out.println(" Tab1 vs Tab2 " + figureOne.equals(figureTwo));
        System.out.println(" Tab1 vs Tab3 " + figureOne.equals(figureThree));
    }
}
