package classEx;

public class Point {

    private int x;
    private int y;

    public void setX (int x){
        this.x = x;
    }
    public int getX (){
        return this.x;
    }
    public void setY (int y){
        this.y = y;
    }
    public int getY () {
        return this.y;
    }

    public String toString(){
        return "X is " + this.x + ", Y is " + this.y + ".";
    }
}
