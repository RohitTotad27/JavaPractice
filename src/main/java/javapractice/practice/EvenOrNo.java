package javapractice.practice;
import java.util.*;
public class EvenOrNo
{
     static Boolean isEven(int n)
     {
         return n%2==0;
     }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num to check if it is even or not ");
        Integer num= scanner.nextInt();
        System.out.println("Is this this the even? "+isEven(num));

   }
}
