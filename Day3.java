import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {

    int[] myArray = {1,2,3,5,55,400};
    System.out.println("The array is sorted? The answer is: " + isSorted(myArray));

    }

    private static boolean isSorted(int[] array){
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }

}
