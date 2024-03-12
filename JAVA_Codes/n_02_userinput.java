//Using Buffer reader class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class n_02_userinput {
    public static void main(String[] args)
     throws IOException{
        BufferedReader reader=new BufferedReader(
            new InputStreamReader(System.in));
            String name=reader.readLine();

            System.out.println(name);
            //Using Console Class
        String name1=System.console().readLine();

        System.out.println("You Entered string  " + name1);
    }


    
    
    
}
