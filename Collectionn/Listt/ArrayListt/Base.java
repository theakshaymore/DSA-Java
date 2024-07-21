package Collectionn.Listt.ArrayListt;

import java.util.ArrayList;
import java.util.List;

public class Base {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(2);
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(5);

        // System.out.println(nums);
        System.out.println(nums.get(3));
        System.out.println(nums.size());
        System.out.println(nums.indexOf(7));

        for (int n : nums) {
            System.out.println(n);
        }

        // for (Object n : nums) {
        // System.out.println((Integer) n);
        // }

    }
}
