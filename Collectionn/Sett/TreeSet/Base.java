package Collectionn.Sett.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Base {
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(33);
        nums.add(89);
        nums.add(12);
        nums.add(35);
        nums.add(35);

        // for (int n : nums) {
        // System.out.println(n);
        // }

        // with Iterator
        Iterator<Integer> values = nums.iterator();

        while (values.hasNext())
            System.out.println(values.next());

    }
}
