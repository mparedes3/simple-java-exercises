import java.util.Scanner;

public class Palindrome {
    public static String reverse(String s){
        String str = "";
        int length = s.length();
        for (int x = 0; x < length; x++ ){
            str = str + s.charAt(length - 1 - x);
        }
        return str;
    }

    public static boolean isPalindrome(String s){
        String reverse = reverse(s);
        if (s.equals(reverse)) return true;
        else if (!s.equals(null)) return false;
        else return false;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide a palindrome.");
        String s = in.next();
        if (isPalindrome(s)) System.out.printf("\nThe word %s is a palindrome", s);
        else if (s.length() == 1) System.out.printf("\nThe letter %s is not a palindrome", s);
        else System.out.printf("\nThe word %s is not a palindrome", s);
    }
}
