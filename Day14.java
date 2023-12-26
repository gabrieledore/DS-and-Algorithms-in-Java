import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println(Arrays.toString(array));
        System.out.println("===================================");
        int[] solvedArray = dutchNationalFlagProblem(array);
        System.out.println(Arrays.toString(solvedArray));
    }

    private static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            Random random = new Random();
            array[i] = random.nextInt(0, 3);
        }

        return array;
    }


    private static int[] dutchNationalFlagProblem(int[] array){
        int z = 0, o = 0, t = 0;
        for(int i = 0; i < array.length; i++){
            switch(array[i]){
                case 0 -> z++;
                case 1 -> o++;
                case 2 -> t++;
            }
        }

        for(int j = 0; j < array.length; j++){
            if(z > 0){
                array[j] = 0;
                z--;
            } else if(o > 0){
                array[j] = 1;
                o--;
            } else{
                array[j] = 2;
                t--;
            }
        }

        return array;
    }
}
