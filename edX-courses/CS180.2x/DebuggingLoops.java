import java.util.Scanner;
public class DebuggingLoops {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int length = str.length();

        //Provides a "triangle" of a str
        for (int x = length; x <= length; x--){
            System.out.println(str.substring(0, x));
        }
        length--;
        while (length > 0){
            System.out.println(str.substring(0, length));
            length--;
        }

        System.out.println(xyBalance("helloxxxxxxxy"));
    }

    public static boolean xyBalance(String str) {
        int x = str.lastIndexOf("x");
        int y = str.lastIndexOf("y");
        if (y > x)
            return true;
        else
            return false;
    }

}
