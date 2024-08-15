package Basic;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int rollNo = sc.nextInt();
//        System.out.println("your roll number is: " + rollNo);

        String name = sc.next();
        String fullName = sc.nextLine();
        System.out.println("your name is: " + name );
        System.out.println("your full name is: " + fullName );



    }
}
