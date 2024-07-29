package Maths;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1211;
        int reverseNum = 0;

        int originalNum = num;
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            reverseNum = (reverseNum * 10) + remainder;
        }

        if (reverseNum == originalNum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
