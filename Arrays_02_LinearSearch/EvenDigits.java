package Arrays_02_LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1,56,45,456,7891,547};

        System.out.println(findNumbers(arr));

    }

    static int findNumbers(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(evenNumber(nums[i])){
                count ++;
            }
        }
        return count;
    }

    static boolean evenNumber(int num){
        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        if(count % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

}
