package tdd;

public class TddEx3 {
    public static void main(String[] args) {
        int [] test = {1,2,3,4,5,6,7,8,9};
        System.out.println(indexNr(test, 5));;
    }
     public static int indexNr(int [] array, int number){
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                index = i;
            }else {
                index = -1;
            }
        }
        return index;
     }

}
