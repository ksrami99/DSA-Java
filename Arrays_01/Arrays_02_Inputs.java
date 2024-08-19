package Arrays_01;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_02_Inputs {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i < arr.length; i++){
            arr[i] = i+1;
           //  arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        for(int j : arr){
            System.out.println(j + " ");
        }

        // arrays of objects
        String[] str = new String[4];
        for(int i=0;i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        str[2] = "KAKAKA";
    }
}
