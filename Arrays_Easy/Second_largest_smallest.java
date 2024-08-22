package Arrays_Easy;

import java.util.Arrays;

public class Second_largest_smallest {
    public static void main(String[] args) {
        int[] arr = {31,21,1,61,8,4,21};
//        System.out.println(secondLargest(arr));
        System.out.println(Arrays.toString(secondLargestSmallest(arr)));
    }


    // Brut force
    // Sorting

    // Better
    static int secondLargest(int[] arr){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int secondLargeEle = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i] > secondLargeEle && arr[i] != largest){
                secondLargeEle = arr[i];
            }
        }
        return secondLargeEle;
    }

    // Optimal

    static int[] secondLargestSmallest(int[] arr){
        int sLargest = secondLargest2(arr);
        int sSmallest = secondSmallest(arr);
        return new int[]{sLargest, sSmallest};
    }

    static int secondLargest2(int[] arr){
        int largeEle = arr[0];
        int sLarge = -1;

        for(int i =1;i<arr.length;i++){
            if(arr[i] > largeEle){
                sLarge = largeEle;
                largeEle = arr[i];
            } else if(arr[i] > sLarge){
                sLarge = arr[i];
            }
        }
        return sLarge;
    }

    static int secondSmallest(int[] arr){
        int smallEle = arr[0];
        int sSmall = Integer.MAX_VALUE;

        for(int i =1;i<arr.length;i++){
            if(arr[i] < smallEle){
                sSmall = smallEle;
                smallEle = arr[i];
            } else if(arr[i] < sSmall){
                sSmall = arr[i];
            }
        }
        return sSmall;
    }


}
