package BasicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1230;

        int revNum = 0;

        while(num !=0){
            int lastDigit = num % 10;
            num = num / 10;

            revNum = (revNum * 10) + lastDigit;

        }

        System.out.println(revNum);

    }
}
