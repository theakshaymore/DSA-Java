package Maths;

public class CountDigits {
    public static void main(String[] args) {
        int num = 8732;

        int count = 0;

        // while (num > 0) {
        // int remainder = num % 10;
        // count++;
        // num = num / 10;
        // }

        count = (int) (Math.log10(num) + 1);

        System.out.println(count);
    }
}
