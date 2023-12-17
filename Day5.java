import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {

        int[] newArr = generateArray();
        System.out.println(Arrays.toString(newArr));
        System.out.println(binarySearch(newArr));

    }

    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            Random random = new Random();
            array[i] = random.nextInt(1000) + 1;
        }
        Arrays.sort(array);
        return array;
    }


    private static boolean binarySearch(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value you wanto to search");
        int n = scanner.nextInt();
        int end = array.length-1;
        int start = 0;
        while(end >= start){
            int m = start + (end - start)/2;
            if(n == array[m]){
                return true;
            } else if(n > array[m]){
                start = m + 1;
            } else{
                end = m -1;
            }
        }
        return false;
    }
}















