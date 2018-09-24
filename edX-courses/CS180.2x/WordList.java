public class WordList {

    static String[] words;
    int count;

    WordList(){
        count = 0;
        words = new String[2];
    }

    public int addWord(String w){
        if(findWord(w) != -1)
            return count;
        else if(words[0] != null && words[1] != null){
            String[] moreWords = {words[0], words[1], w};
            count++;
        }
        for(int i = 0; i < words.length; i++){
            if(words[i] == null) {
                words[i] = w;
                count++;
            }
        }
        return count;
    }

    public void removeWord(String w){
        String w0 = words[0];
        String w1 = words[1];

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(w)) {
                words[i - 1] = w0;
                words[i] = null;
                count--;
            }
        }
    }

    public int findWord(String w){
        for (int i = 0; i < words.length; i++){
            if (words[i].equals(w))
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
    }
}
