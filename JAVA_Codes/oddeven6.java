import java.util.Scanner;
public class oddeven6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even" +num );
        
    }
    else{
        System.out.println( "The number is odd number " +num);
    }

    sc.close();
}
}
