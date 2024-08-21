package Arrays_02_LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {45,1,61,3,46,65,31,43,1};
        int s = 2;
        int e = 5;
        int target = 45;
        System.out.println(search(arr,s,e, target));
    }

    static Boolean search(int[] arr, int s, int e, int target){
        for(int i = s; i<=e ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
