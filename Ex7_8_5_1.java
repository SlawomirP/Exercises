public class Ex7_8_5_1 {
    public static void main(String[] args) {

        int[] int1 = {1, 2, 3, 4, 5};
        int[] int2 = {1, 2, 3, 4, 5};
        System.out.println(compare(int1, int2));

        String [] string1 = {"abc", "def", "ghi"};
        String [] string2 = {"abc", "def", "ghj"};
        System.out.println(compare(string1, string2));

    }

    static boolean compare(int a, int b) {
        return a == b;
    }

    static boolean compare(double a, double b) {
        return a == b;
    }

    static boolean compare(boolean a, boolean b) {
        return a == b;
    }

    static boolean compare(char a, char b) {
        return a == b;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    static boolean compare(int[] a, int[] b) {
        boolean compLength = a.length == b.length;
        boolean compInt = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                compInt = true;
            } else {
                compInt = false;
            }
        }
        if (compLength && compInt) {
            return true;
        } else {
            return false;
        }

    }

    static boolean compare(String[] a, String[] b) {
        boolean compLength = a.length == b.length;
        boolean compStrings = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b[i])) {
                compStrings = true;
            } else {
                compStrings = false;
            }
        }
        if (compLength && compStrings) {
            return true;
        } else {
            return false;
        }
    }

}
