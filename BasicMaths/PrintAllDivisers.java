package BasicMaths;



public class PrintAllDivisers {
    public static void main(String[] args) {
        int n = 36;

        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
