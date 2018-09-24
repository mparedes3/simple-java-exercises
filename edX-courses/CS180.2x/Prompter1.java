import java.util.Scanner;

public class Prompter1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;

        do{
            System.out.println("Please insert an even integer");
            num = in.nextInt();
            if (num % 2 == 1)
                System.err.print("ERROR: PLEASE PROVIDE AN INTEGER!\n\n\n");
        } while (num % 2 == 1);

        System.out.println("Thank you for following the order!");
    }
}
