package javapractice.practice.reverseAndpalindrome;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String str_3= new StringBuffer(str).reverse().toString();//Using A StringBuffer ot String Builder class
        //We have revrse() method hence we can dio that automatically.....
        if(str.equals(str_3)){
            System.out.println("Its a Pali");}
        else{
        System.out.println("Not a Pali");}
        System.out.println(str_3);
        //Otherwise we have to use the below method
        String str_2="";
        int l = str.length();
        for(int i = l-1;i>=0;i--){
            str_2=str_2+str.charAt(i);
        }
        if(str.equals(str_2)){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}
