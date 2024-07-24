package Collectionn.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Base {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 8, 3, 5, 6);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 =  s2.map(n -> n*2);

        s3.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));

        // System.out.println(s2);

    }
}
