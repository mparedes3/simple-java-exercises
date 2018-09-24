public class Geometric {


    public static String scrambler(String s) {
        /*** TODO: Write a recursively defined function that behaves as follows:
         base case 1: length of s is 0; return an empty String
         base case 2: length of s is 1, return s
         base case 2: length of s is 2, return s reversed (i.e., "ab" -> "ba")
         recursive case: return the concatenation of the last character of s,
         the outcome of a recursive call passing letters 2 up to but not
         including the midpoint of s, the outcome of a recursive call passing
         letters midpoint of s to the length of s minus 1, and the first
         character of s (i.e. scrambler("computers") -> "s" + scrambler("omp") +
         scrambler("uter") + "c") ***/

        if (s.length() == 0) return "";
        else if (s.length() == 1) return s;
        else if (s.length() == 2) return s.substring(1) + s.substring(0, 1);

        return s.substring(s.length() - 1) + scrambler(s.substring(s.length() / 2 - 1, s.length() - 1)) + s.substring(0, 1);
    }

    }
