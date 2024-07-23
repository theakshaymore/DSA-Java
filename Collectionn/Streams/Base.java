package Collectionn.Streams;

import java.util.Arrays;
import java.util.List;

public class Base {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 8, 3, 5, 6);

        nums.forEach(n -> System.out.println(n * 2));

        System.out.println(nums);

    }
}
