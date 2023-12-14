import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        int[] brandNewArray = readNumbers(5);
        System.out.println("The min value of the array is " + findMin(brandNewArray));
        System.out.println("The max value of the array is " + findMax(brandNewArray));

    }


    private static int[] readNumbers(int num){
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[num];
        for(int i = 0; i < newArray.length; i++){
            System.out.println("Enter a new integer to add");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }


    public static int findMin(int[] array){
        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int findMax(int[] array){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
