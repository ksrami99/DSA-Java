package BasicMaths;


public class GCD_HCL {
    public static void main(String[] args) {
        int n1 = 40;
        int n2 = 20;

        int GCD = 1;

        // Brute Force
//        for (int i = 1; i < Math.min(n1,n2); i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                GCD = i;
//            }
//        }

        // Batter

//        for(int i = Math.min(n1,n2);i>1;i--){
//            if(n1%i == 0 && n2%i==0){
//                GCD = i;
//                break;
//            }
//        }

        // Optimal | Equilateral Algorithm


        while (n1> 0 && n2 > 0){

            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            }
        }

        if(n1==0) System.out.println(n2);
        else System.out.println(n1);

//        System.out.println(GCD);

    }
}
