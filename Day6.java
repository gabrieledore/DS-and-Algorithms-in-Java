import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println(Arrays.toString(array));
        int[] orderedArray = binaryOrder(array);
        System.out.println(Arrays.toString(orderedArray));

    }


    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            Random random = new Random();
            array[i] = random.nextInt(0,2);
        }
        return array;
    }


    private static int[] binaryOrder(int[] array){
        int ones = 0;
        int zeros = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                zeros+=1;
            } else{
                ones+=1;
            }
        }


        for(int j = 0; j < zeros; j++){
            array[j] = 0;
        }
        for (int k = zeros -1; k < array.length; k++){
            array[k] = 1;
        }

        return array;
    }
}


