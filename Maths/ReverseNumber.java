package Maths;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 9834;
        int reverseNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            reverseNum = (reverseNum * 10) + remainder;
        }

        System.out.println(reverseNum);
    }
}
