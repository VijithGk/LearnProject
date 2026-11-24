import java.util.Arrays;

public class code {
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5};

        int arr1[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }

        System.out.println(Arrays.toString(arr1));
    }
}