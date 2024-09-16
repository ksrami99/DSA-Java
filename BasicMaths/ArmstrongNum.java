package BasicMaths;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 163;
        int num = n;

        int k = String.valueOf(n).length();
        int sum =0;
        while (n != 0){
            int lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit, k));
            n = n / 10;
        }
        System.out.println(num == sum);
    }
}
