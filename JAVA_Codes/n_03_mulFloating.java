import java.util.*;
public class n_03_mulFloating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Floating Number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the Sceond Number: ");
        float b=sc.nextFloat();
        float mul =(a*b);
         
        System.out.print("The multiply two number is:");
        System.out.println(mul);
        sc.close();
    }
    
}
