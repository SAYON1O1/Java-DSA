import java.util.*;

public class Hello {
    public static void main (String args[]){
        // Scanner and System always capital 
        Scanner sc = new Scanner(System.in); 
        // use next ----> for any text input without spaces
        // use nextLine() -----> for String input with spaces 
        String PtrName = sc.nextLine();
        System.out.print("hello\t"+ PtrName);
    }
   
}
