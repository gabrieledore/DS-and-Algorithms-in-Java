import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(array));
        System.out.println("====================================================");
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(bubbleSorting(array)));
    }


    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the minimum value");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value");
        int max = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            Random random = new Random();
            array[i] = random.nextInt(min, max + 1);
        }

        return array;
    }

    private static int[] bubbleSorting(int[] array){
        int n = array.length;
        int m = 0;

        while(m < n){
            m+=1;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }
}


//while loop of n
//inside while loop using a for loop