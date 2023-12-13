import java.util.Arrays;
import java.util.Random;

public class Day1 {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(descendingOrderArray(firstArray)));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];


        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }


    private static int[] descendingOrderArray(int[] array){
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        for(int i = 0; i < array.length/2; i++){
            int temp = arrayCopy[i];
            arrayCopy[i] = arrayCopy[array.length-1 - i];
            arrayCopy[array.length-1 - i] = temp;
        }
        return arrayCopy;
    }



}
