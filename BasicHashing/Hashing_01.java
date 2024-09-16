package BasicHashing;

import java.util.Scanner;

public class Hashing_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            System.out.print(i + ": " );
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int[] hash = new int[13];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("enter Num: ");
        int n1 = sc.nextInt();

        System.out.println(hash[n1]);





    }
}
