import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        int[] myArr = generateArray();
        System.out.println(Arrays.toString(myArr));
        System.out.println(pairForSum(myArr, 9));


    }

    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you want");
        int num = scanner.nextInt();
        int[] array = new int[num];
        for(int n = 0; n < array.length; n++){
            array[n] = n;
        }
        return array;
    }


    private static boolean pairForSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i != j && array[i] + array[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

}