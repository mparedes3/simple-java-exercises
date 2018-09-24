public class ScoresAverage {

    public static int scoresAverage(int[] scores) {
        int average1 = average(scores, 0, scores.length / 2 - 1);
        int average2 = average(scores, scores.length / 2, scores.length - 1);

        if(average1 > average2) return average1;
        else return average2;
    }

    public static int average(int[] scores, int start, int end){
        int sum = 0;

        while(start <= end){
            sum += scores[start];
            start++;
        }

        return sum /(end + 1);
    }

    public static void main(String[] args){
        int[] lmao = {2, 2, 4, 4};
        System.out.println(scoresAverage(lmao));
    }
}
