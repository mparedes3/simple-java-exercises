import java.util.Scanner;

public class PracticeOddEven {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x % 2 == 0){
            System.out.println("The number you inserted is odd.");
        }
    }
}
