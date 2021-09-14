import java.util.Arrays;
public class InsertionSort {

    public static void main(String args[]){
        /*int[] arr = new int[args.length];
        for(int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);*/

        int[] arr = {2,10,20,5,9,8,11};
        System.out.println("Given Array:");
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
