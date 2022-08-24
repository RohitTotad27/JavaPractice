package javapractice.practice.reverseAndpalindrome.string;

import java.util.Scanner;

public class SubStringEx {

    public static void main(String[] args) {
        System.out.println("Enter the String!");
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
       String str_new= str.substring(4);
       System.out.println("New String : "+str_new);
       //If you want to give a range then you can

        String str_new_1=str.substring(4,8);
        System.out.println("New String with range "+str_new_1);
    }
}
