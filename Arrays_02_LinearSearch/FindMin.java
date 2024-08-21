package Arrays_02_LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {45,61,32,46,65,31,43};
        System.out.println("The minimum number in this Arary is: " + findMin(arr));
    }

    static int findMin(int[] arr){
        int min = arr[0];

        for(int i =1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }
}
