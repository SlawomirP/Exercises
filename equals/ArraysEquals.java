package equals;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {

        int [] tab1 = {1,2,3,4,5};
        int [] tab2 = {1,2,3,4,5};
        int [] tab3 = {1,2,3};

        if (Arrays.equals(tab1, tab2)){
            System.out.println("tab1 = tab2");
        }else {
            System.out.println("tab1 != tab2");
        }
        if (Arrays.equals(tab1, tab3)){
            System.out.println(" tab1 = tab3");
        }else {
            System.out.println("tab1 != tab3");
        }
        }


    }

