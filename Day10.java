import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println(Arrays.toString(array));
        int[] newArray = mergeSort(array);
        System.out.println(Arrays.toString(newArray));


    }


    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the minimum value of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value of the array");
        int max = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(min, max+1);
        }

        return array;
    }

    private static int[] mergeSort(int[] array){
        int inputLength = array.length;

        if(inputLength < 2){
            return array;
        }

        int mid = array.length/2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];


        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }


        for (int j = mid; j < array.length; j++){
            right[j - mid] = array[j];
        }


        int[] leftSide = mergeSort(left);
        int[] rightSide = mergeSort(right);

        merge(array, leftSide, rightSide);

        return array;

    }


    private static int[] merge(int[] array, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;

        //int i --> to keep track of the left array index
        //int j --> to keep track of the right array index
        //int k --> to keep track of the merged array index
        int i = 0, j = 0, k = 0;


        while(i < leftSize && j < rightSize){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }


        while(i < leftSize){
            array[k] = left[i];
            i++;
            k++;
        }

        while(j < rightSize){
            array[k] = right[j];
            j++;
            k++;
        }

        return array;

    }


}
