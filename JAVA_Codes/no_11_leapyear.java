import java.util.Scanner;
public class no_11_leapyear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year:");
        double year=sc.nextDouble();
       
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("This is a leap year");
                
            }
            else{
                System.out.println("This year not leap year :");
            }
        
            sc.close();
    }

    }

