import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        int[] array1 = generateArray();
        int[] array2 = generateArray();
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }

    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the minimum value of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value of the array");
        int max = scanner.nextInt() + 1;
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            Random random = new Random();
            array[i] = random.nextInt(min, max);
        }
        return array;
    }



    private static void inPlaceMergeTwoSortedArrays(int[] arr1, int[] arr2){
        //sort two arrays
        Arrays.sort(arr1);
        Arrays.sort(arr1);
        //creat a count variable to keep track of the numbers checked in total
        // 2. find the minimum value between two arrays and put it at first position and switch if necessary
        // repeated the pass above but from position two of the first array
        // when there is no values in the first array, passage 2 for just the second array

        

    }

}


