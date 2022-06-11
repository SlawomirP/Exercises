import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Quadratic Equation: Ax^2 + Bx + C = 0");
            System.out.println("Write your parameter A ...");
            int a = scanner.nextInt();
            System.out.println("Write your parameter B ...");
            int b = scanner.nextInt();
            System.out.println("Write your parameter C ...");
            int c = scanner.nextInt();

            System.out.println("Your equation is: ");
            System.out.println(a + "x^2 " + "+ " + b + "x" + " + " + c + " = 0");

            double delta = Math.pow(b, 2) - (4 * a * c);

            System.out.print("Preparing resolve ");

            try {
                for (int i = 0; i <= 2; i++) {
                    System.out.print(".");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted error.");
            }

            System.out.println();

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Equation has 2 resolves.");
                System.out.println("----- x1 = " + (float) x1 + ", x2 = " + (float) x2 + " -----");
            } else if (delta == 0) {
                System.out.println("Equation has 1 resolve.");
                double x = -b / (2 * a);
                System.out.println("----- x1 = " + x + " -----");
            } else {
                System.out.println("Equation hasn't resolve.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Write only numbers.");
        }
    }
}
