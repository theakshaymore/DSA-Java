package Basics;

public class Patterns7 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            // space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("\n");
        }
    }
}
