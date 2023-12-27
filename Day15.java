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
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        

    }

}


