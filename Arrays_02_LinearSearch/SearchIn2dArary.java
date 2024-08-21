package Arrays_02_LinearSearch;

public class SearchIn2dArary {
    public static void main(String[] args) {
        int[][] arr= {
            {12,45,5,6},
            {78,98,56},
            {23,85}
        };
        int target = 90;
        System.out.println(search(arr, target));

    }

    static Boolean search (int [][] arr, int target){

        for(int i =0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
