import java.util.Scanner;
public class n_01_readinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("The input number is :" + num);

        sc.close();
    }
    
}
