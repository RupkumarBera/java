import java.util.Scanner;
public class largesst7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three number :");
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int largest = num1;
        if(num2>largest){
            largest=num2;
        }
         if (num3>largest){
            largest=num3;
        }
       
            System.out.println("The largest num is "+largest);
        
        sc.close();
    }
    
}
