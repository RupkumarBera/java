
    import java.util.Scanner;

public class  Lcm8{
    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Function to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM
        int result = lcm(num1, num2);

        // Print the LCM
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}

    

