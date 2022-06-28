public class MainExc {
    public static void main(String[] args) {

        Dividing dividing = new Dividing();
        try {
            System.out.println(dividing.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0 !");
        }
        try {
            System.out.println(test(5, 0));
        } catch (ArithmeticException ex) {
            System.out.println("Divide by 0 ??");
        }

        try {
            methodForExc(5, 0);
        } catch (MyDivideExc e) {
            System.out.println(e.getMessage());;
        }
    }
    static int test(int a, int b) {
        return a / b;
    }
    public static int methodForExc (int a, int b) throws MyDivideExc {
        if (b == 0) {
            throw new MyDivideExc();
        }
        return a /b;
    }
}
