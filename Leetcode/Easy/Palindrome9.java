package Leetcode.Easy;

public class Palindrome9 {
    class Solution {
        public boolean isPalindrome(int x) {

            int OgNumber = x;
            int reverseNum = 0;

            while (x > 0) {
                int remainder = x % 10;
                x = x / 10;
                reverseNum = (reverseNum * 10) + remainder;
            }

            if (OgNumber == reverseNum)
                return true;
            else
                return false;
        }
    }
}
