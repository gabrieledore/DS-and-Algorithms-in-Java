import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
//      Generate array1 of size m and array2 of size n with m >= n and consider 0s in the array1 as empty spots
        int[] array1 = generateFirstArray();
        int[] array2 = generateSecondArray(array1);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


        int[] newFirstArray = fromTwoPartialArraysToOneFull(array1, array2);
        System.out.println(Arrays.toString(newFirstArray));



    }


    private static int[] generateFirstArray(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(0, 10001);
        }

        Arrays.sort(array);

        int randomPick = random.nextInt(1, size-2);
        for(int j = 0; j < size; j++){
            if(array[random.nextInt(0, size)] != 0){
                array[j] = 0;
            }
        }

        return array;
    }

    private static int countZeros(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                count++;
            }
        }


        return count;
    }


    private static int[] generateSecondArray(int[] firstArray){
        Random random = new Random();
        int length = countZeros(firstArray);
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1, 10001);
        }

        Arrays.sort(array);
        return array;
    }


    private static int[] fromTwoPartialArraysToOneFull(int[] firstArray, int[] secondArray){
        
        return firstArray;
    }


}
