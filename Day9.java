import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {

        int[] array = generateArray();
        System.out.println(Arrays.toString(array));
        int[] newArray = insertionSort(array);
        System.out.println(Arrays.toString(newArray));

    }

    private static int[] generateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the minimum value of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value of the array");
        int max = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(min, max + 1);
        }

        return array;
    }


    private static int[] insertionSort(int[] array) {
            for(int i = 1; i < array.length; i++){
                int min = i-1;
                while(-1 < min && array[i] <= array[min]){
                    int temp = array[min];
                    array[min] = array[i];
                    array[i] = temp;
                    i--;
                    min--;
                    }

                }
                return array;
            }

    }









