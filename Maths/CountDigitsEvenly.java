package Maths;

public class CountDigitsEvenly {
    public static void main(String... args) {
        int num = 342;
        int count = 0;
        int OgNum = num;

        while (num > 0) {
            int remainder = num % 10;
            if (remainder != 0 && OgNum % remainder == 0) {
                count++;
            }
            num = num / 10;
        }

        // return count;
        System.out.println(count);
    }
}
