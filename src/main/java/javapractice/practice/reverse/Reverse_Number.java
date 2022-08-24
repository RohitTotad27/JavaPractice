package javapractice.practice.reverse;

import java.util.Scanner;

public class Reverse_Number {

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        int num = scanner.nextInt();
        while(num>0){
             r = num%10;
            System.out.print(r);
            num=num/10;
        }

    }
}
