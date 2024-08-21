package Arrays_02_LinearSearch;

import java.util.Scanner;

public class LinearSearch_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,52,8,6,4,7,2,4,52,2};
        System.out.println("Enter the Target");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target));

    }

    static boolean linearSearch(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
