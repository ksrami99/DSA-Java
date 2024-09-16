package BasicMaths;


public class DigitCount {
    public static void main(String[] args) {
        int num = 123;

        int numOfDigits = 0;
        while(num != 0){
            num = num / 10;
            numOfDigits++;
        }

        System.out.println(numOfDigits);


        // logarithmic method

//        int cnt = (int) (Math.log10(num) + 1);
//        System.out.println(cnt);
    }
}
