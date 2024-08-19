package Arrays_01;

import java.util.ArrayList;
import java.util.Scanner;

public class AraryList_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(68);
        list.add(67);
        list.add(67);

        list.contains(68);

        System.out.println(list.set(0,99));
        System.out.println(list.size());

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }



        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        // Initialization
        for (int i =0;i< 3; i++){
            list2.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(sc.nextInt());
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(list2.get(i));
            }
        }
     }
}
