package solutions;

public class ScoreOfString {

    public int scoreOfString(String s) {
        int n = s.length();

        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            counter += (Math.abs(s.charAt(i) - s.charAt(i + 1)));
        }
        
        return counter;
    }
}
