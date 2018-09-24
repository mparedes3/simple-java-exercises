public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1);

        /**
         *  fibonacci(3) -> fibonacci(2) -> fibonacci (1)
         *                                  return 1
         *
         *
         *
         *
         */
    }

    public static void main(String[] args){
        System.out.println(fibonacci(3));
    }
}
