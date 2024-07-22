package Collectionn.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingString {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;

            }
        };

        List<String> nums = new ArrayList<>();
        nums.add("akshay");
        nums.add("rohit");
        nums.add("atharva");
        nums.add("pd");

        // for (int i = 0; i <= nums.length(); i++)
        // if (i.length() > i)

        // Collections.sort(nums, comparator);
        System.out.println(nums);
    }
}
