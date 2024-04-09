
    import java.util.Scanner;

public class GCD9{
    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}


