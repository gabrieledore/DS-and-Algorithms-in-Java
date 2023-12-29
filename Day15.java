import java.util.Arrays;

public class Day15 {
    public static void main(String[] args) {
        int[] array1 = {1,4,7,8,10};
        int[] array2 = {2,3,9};
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("================");
        inPlaceMergeTwoSortedArrays(array1, array2);
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }


    private static void inPlaceMergeTwoSortedArrays(int[] arr1, int[] arr2){

        //sort two arrays
        Arrays.sort(arr1);
        Arrays.sort(arr1);
        int m = arr1.length;
        int n = arr2.length;

        for(int i = 0; i < m; i++){
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;


                int first = arr2[0];
                int k;
                for(k = 1; k < n && arr2[k] < first; k++){
                    arr2[k-1] = arr2[k];
                }
                arr2[k-1] = first;
            }
        }
    }



}

