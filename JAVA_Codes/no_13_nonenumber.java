
import java.util.Scanner;

public class no_13_nonenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a neon number: ");
        int number = scanner.nextInt();
        scanner.close();

 
        int square = number * number;

        int digitSum = 0;
        while (square != 0) {
            digitSum += square % 10;
            square /= 10;
        }


        if (digitSum == number) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
    }
}
