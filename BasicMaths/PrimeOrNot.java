package BasicMaths;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 2; i<n/2; i++){
            if(n%i == 0) {
                System.out.println("The number is not prime !!");
                return;
            }
        }
        System.out.println("The number is Prime");

    }
}
