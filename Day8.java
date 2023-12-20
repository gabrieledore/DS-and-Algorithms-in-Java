import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day8 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = generateArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(selectionSort(array)));

    }


    private static int[] generateArray(){
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        System.out.println("Enter the minimum value of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value of the array");
        int max = scanner.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            Random random = new Random();
            array[i] = random.nextInt(min, max+1);
        }

        return array;
    }


    private static int[] selectionSort(int[] array){
        int[] copy = Arrays.copyOf(array, array.length);
        int iterations = 0;
        while(iterations <  array.length){
            int i = iterations;
            int min = Integer.MAX_VALUE;
            for(; i < array.length; i++){
                if(array[i] < min){
                    min = array[i];
                }
            }
            copy[iterations] = min;
            iterations++;
        }
        return copy;
    }
}
