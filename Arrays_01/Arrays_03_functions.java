package Arrays_01;

import java.util.Arrays;

public class Arrays_03_functions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 5;
    }
}
