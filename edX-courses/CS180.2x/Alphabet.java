import java.util.Scanner;

public class Alphabet {

    public static String whatsMissing(String str){
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int length = abc.length();
        String letter;
        String missing = "";

        for (int x = 0; x < length; x++){
            letter = abc.substring(x, x + 1);

            if (str.indexOf(letter) < 0){
                missing = missing + letter;
            }
        }

        return missing;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert a word:");
        String word = in.next();

        System.out.println("The missing letters are: " + whatsMissing(word.toLowerCase()) + ".");

    }
}
