import java.util.Arrays;
public class InsertionSort {

    public static void main(String args[]){
    

        int[] arr = {49,1,5,57,27,30};
        System.out.println("Given Array(After changes):");
        System.out.println(Arrays.toString(arr));

        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i;
            while(j>=1 && current < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = current;
        }
        System.out.println("Output Array:");
        System.out.println(Arrays.toString(arr));
    }

}
