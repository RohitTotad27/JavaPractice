package javapractice.practice;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Anagram an= new Anagram();
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Enter the 2nd String");
        String b = scanner.nextLine();
        System.out.println(an.isAnagram(a,b));
    }

      boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;

        a=a.toLowerCase();
        b=b.toLowerCase();

        int[] char_frequencies = new int[26];

        for(int i = 0 ; i<a.length();i++){
            char current_char = a.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]++;
        }
        for(int i = 0 ; i<b.length();i++){
            char current_char = b.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]--;
        }

        for(int i=0;i<26;i++){
            if(char_frequencies[i]!=0) return false;
        }
        return true;
    }
}
