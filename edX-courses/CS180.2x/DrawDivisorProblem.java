public class DrawDivisorProblem {
    public static void main(String[] args){

        int n = 100;

        System.out.print("   ");
        for (int x = 1; x <= n; x++){
            if (x < 10) System.out.printf("%d  ", x);
            else System.out.printf("%d ", x);
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "  ");
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 || j % i == 0)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }

            System.out.println();
        }
    }
}
