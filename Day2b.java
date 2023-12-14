import java.util.Arrays;
import java.util.Scanner;

public class Day2b {
    public static void main(String[] args) {
        int[] myArray = {1,5,36,42,25};
        System.out.println(Arrays.toString(reverse(myArray)));


    }

    private static int[] reverse(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            copy[i] = array[array.length-1 - i];
            copy[array.length-1 - i] = temp;
        }
        return copy;
    }

}



