import java.util.Arrays;
import java.util.Scanner;

public class Day3b {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(24));

    }

    private static boolean isPowerOfTwo(int num){
        while(num > 1){
            if(num % 2 == 0){
                num /=2;
            } else{
                return false;
            }
        }
        return true;
    }

}