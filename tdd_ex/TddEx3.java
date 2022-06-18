package tdd;

public class TddEx3 {
    public static void main(String[] args) {

//        int [] test = {1,2,3,4,5};
//        System.out.println(indexNr(test, 1));

        indexNr_number_indexNr();
        indexNr_numberOutsideArray_minus1();
        indexNr_number_firstArrayIndex();
        indexNr_number_lastIndex();
        indexNr_negativeNumberInArray_2();
        indexNr_emptyArray_minus1();
    }
     public static int indexNr(int [] array, int number){
        for(int i = 0; i < array.length; i++){
            if(number == array[i]){
                return  i;
            }
        }
        return -1;
     }

     // test 1 number is in array
    public static void indexNr_number_indexNr(){
        int [] testArray = {1,2,3,4,5};
        assertEquals(2, indexNr(testArray, 3));
    }
    // test 2 number ins't in array
    public static void indexNr_numberOutsideArray_minus1 (){
        int [] testArray = {1,2,3,4,5};
        assertEquals(-1, indexNr(testArray, 6));
    }
    // test 3 number is at 0 index
    public static void indexNr_number_firstArrayIndex(){
        int [] testArray = {1,2,3,4,5};
        assertEquals(0, indexNr(testArray, 1));
    }
    //test 4 number is at last index
    public static void indexNr_number_lastIndex(){
        int [] testArray = {1,2,3,4,5};
        assertEquals(4, indexNr(testArray,5));
    }
    // test 5 negative number is in array
    public static void indexNr_negativeNumberInArray_2(){
        int [] testArray = {1,2,-3,4,5};
        assertEquals(2, indexNr(testArray, -3));
    }

    // test 6 empty array
    public static void indexNr_emptyArray_minus1 (){
        int [] testArray = {};
        assertEquals(-1, indexNr(testArray, 5));
    }

    public static void assertEquals(int expect, int actual){
        if(expect != actual) {
            System.out.println("We expected " + expect + ", but we get " + actual + ".");
        }
    }
}
