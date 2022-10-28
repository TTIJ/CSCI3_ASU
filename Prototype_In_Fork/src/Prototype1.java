import java.util.Scanner;
public class Prototype1 {
   public static void main(String[] args) throws Exception
   {
    int passwordLength=8, Caps=0, lower=0;
    int special=0, num=0;
    char ch;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Password: ");
    String password = s.nextLine();
    
    int total = password.length();
    if(total<passwordLength)
    {
       System.out.println("\nThe Password is invalid!");
       return;
    }
    else
    {
        for(int i=0; i<total; i++)
         {
            ch = password.charAt(i);
            if(Character.isUpperCase(ch))
               Caps = 1;
            else if(Character.isLowerCase(ch))
               lower = 1;
            else if(Character.isDigit(ch))
               num = 1;
            else
               special = 1;
         }
      }
      if(Caps==1 && lower==1 && num==1 && special==1)
         System.out.println("\nThe Password is Strong.");
      else
         System.out.println("\nThe Password is Weak.");
   }
}