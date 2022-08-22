package javapractice.practice;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class VerifyPassword
{
    public static void main(String[] args)
        {
            VerifyPassword verifyPassword = new VerifyPassword();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password ");
        String pwd = sc.nextLine();
        System.out.println("Is this password Strong " +verifyPassword.isPasswordStrong(pwd));
        }

    private  Boolean isPasswordStrong(String pwd)
    {
        if(pwd.length()<6)
        {
            return false;
        }
        Boolean isNumber=false;
        Boolean isUpperCase=false;
        Boolean isLowerCase=false;
        for(int i=0;i<pwd.length()||(!isLowerCase && !isUpperCase && !isNumber);i++)
        {
            char current = pwd.charAt(i);
            if(Character.isDigit(current))
            {
                isNumber=true;
            } else if (Character.isLowerCase(current))
            {
                isLowerCase=true;
            } else if (Character.isUpperCase(current))
            {
                isUpperCase=true;
            }
        }
        return isNumber&&isLowerCase&&isUpperCase;
    }
}

