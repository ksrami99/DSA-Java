package Arrays_Easy;

public class Largest_element {
    public static void main(String[] args) {
        int[] arr = {31,211,1,61,8,4,21};
        System.out.println(largest(arr));
    }
    static int largest(int[] arr){
        int largeEle = arr[0];

        for(int i =1;i<arr.length;i++){
            if(arr[i] > largeEle) {
                largeEle = arr[i];
            }
        }

        return largeEle;
    }
}
