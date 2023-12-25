import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,3,9};
        System.out.println(Arrays.toString(array));
        System.out.println("=======================================");
        System.out.println(findDuplicate(array));
    }

    private static int findDuplicate(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                    if((j != i) && (array[j] == array[i])){
                        return array[j];
                    }
            }
        }
        return -1;
    }
}
