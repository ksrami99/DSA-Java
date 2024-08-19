package Arrays_01;

import java.util.Arrays;

public class multiDimentionalArray_04 {
    public static void main(String[] args) {
        /*
        *       1 2 3
        *       4 5 6
        *       7 8 9
        *
        * */

        int[][] arr = {
                {1,2,3},
                {4,5,54},
                {7,8,9}
        };

        System.out.println(Arrays.toString(arr[1]));

        for(int row =0; row< arr.length; row++){
            for (int col =0; col< arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}
