package tdd_ex;

public class TddEx2 {
    public static void main(String[] args) {

        signCheck_positiveNumber_1();
        signCheck_negativeNumber_minus1();
        signCheck_zero_zero();

    }

    public static int signCheck(int x) {
        if (x > 0) {
            return 1;
        }
        if (x < 0) {
            return -1;
        }
        return 0;
    }

    // test 1 positive number , result 1

    public static void signCheck_positiveNumber_1 (){
        if (1 != signCheck(5)){
            System.out.println("Result should be 1 but is " + signCheck(5));
        }
    }

    // test 2 negative number

    public static void signCheck_negativeNumber_minus1 (){
        if (-1 != signCheck(-5)){
            System.out.println("Result should be -1 but is " + signCheck(-5));
        }
    }

    // test 3 zero

    public static void signCheck_zero_zero (){
        if (0 != signCheck(0)){
            System.out.println("Result should be 0 but is " + signCheck(0));
        }
    }

}
