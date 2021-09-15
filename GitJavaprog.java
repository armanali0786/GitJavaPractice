import java.util.Scanner;

public class GitJavaprog
{
   public static void main(String[] args)
 {
       int num = 0;
       int reversed=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       num = sc.nextInt();
 
         while(num != 0)
      {
         int digit = num % 10;
         reversed = reversed * 10 + digit;
         num /= 10;
      }

         System.out.println("Reversed Number: " + reversed);
         System.out.println("Hello Arman Babu");
   }
       
 }