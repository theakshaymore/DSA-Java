package Maths;

public class CountDigits {
    public static void main(String[] args) {
        int num = 8732;

        int count = 0, remainder = 0;

        while (num > 0) {
            remainder = num % 10;
            count++;
            num = num / 10;
        }

        System.out.println(count);
    }
}
