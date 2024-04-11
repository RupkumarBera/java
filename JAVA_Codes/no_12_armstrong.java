import java.util.Scanner;
public class no_12_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :");
        int number =sc.nextInt();
        sc.close();
        if(isarmstrong(number)){
            System.out.println(number + " is armstrong number.");
        }
        else{
            System.out.println(number + " is not an armstrong number ");
        }
    }
    public static boolean isarmstrong(int num) {
        int originamlnumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum +=Math.pow(digit,numberOfDigits);
            num/=10;
        }
        return sum== originamlnumber;
        
    }
    
}
