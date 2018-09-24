import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int a){

        for (int x = 2; x < a; x++){

            if (a % x == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please insert a positive prime number.");
        int num = s.nextInt();
        if (isPrime(num))
            System.out.printf("The number %d is a prime.", num);
        else
            System.out.printf("The number %d is not a prime.", num);
    }
}
