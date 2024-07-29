package Maths;

public class Palindrome {
    public static void main(String[] args) {
        int num = 11;
        int reverseNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            reverseNum = (reverseNum * 10) + remainder;
        }

        if (reverseNum == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
