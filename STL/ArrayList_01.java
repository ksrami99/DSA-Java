package STL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println(arr);

//        arr.remove(1);
        System.out.println(arr);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(100);
        list.add(1000);

        arr.addAll(list);

        System.out.println(arr);

        System.out.println(arr.size());
        arr.removeAll(list);
        System.out.println(arr);

        System.out.println(arr.size());

        System.out.println(list);

//        list.clear();
        System.out.println(list);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        list.clear();

        list.add(45);
        list.add(5);
        list.add(57);
        list.add(65);
        list.add(12);

        System.out.println(list);
        Collections.sort(list);
//        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);



    }
}
