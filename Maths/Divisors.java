package Maths;

public class Divisors {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;

        for (int i = 2; i < n; i++) {
            if (2 / i == 0)
                System.err.println(i);
        }
    }
}
