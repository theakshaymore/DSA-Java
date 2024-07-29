package Maths;

public class ArmStrong {
    public static void main(String[] args) {

        int num = 371;
        int sum = 0;

        int originalNum = num;
        while (num > 0) {
            int remainder = num % 10;
            sum = sum + (remainder * remainder * remainder);
            num = num / 10;
        }

        if (sum == originalNum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
