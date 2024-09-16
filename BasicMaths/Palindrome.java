package BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int num = 123221;

        int revNum = 0;
        int n = num;

        while(n !=0){
            int lastDigit = n %10;
            n = n /10;
            revNum = (revNum * 10) + lastDigit;
        }


            System.out.println("the number id Palindrome : " + (revNum == num) );

    }
}
