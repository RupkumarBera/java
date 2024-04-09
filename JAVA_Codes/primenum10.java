import java.util.Scanner;
public class primenum10 {
    public static boolean isPrime(int num) {
        if(num<=1){
             return false;
        }
        for (int i =2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers between 1 and " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

