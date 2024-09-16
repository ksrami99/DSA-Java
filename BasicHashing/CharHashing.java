package BasicHashing;

import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] hash = new int[256];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        System.out.println("enter the char : ");

        char a = sc.next().charAt(0);

        System.out.println(hash[a]);

    }
}
