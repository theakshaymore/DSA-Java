package Collectionn.Sett.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Base {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<Integer>();

        nums.add(33);
        nums.add(12);
        nums.add(45);
        nums.add(89);
        nums.add(35);
        nums.add(35);

        for (int n : nums) {
            System.out.println(n);
        }

        //
    }
}
