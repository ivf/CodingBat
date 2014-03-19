import java.util.Arrays;

public class AP1 {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] > scores[i+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        boolean is100100 = false;
        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] == 100) {
                if (scores[i+1] == 100) is100100 = true;
                else is100100 = false;
                i++;
            }
        }
        return is100100;
    }

    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) return false;
        for (int i = 0; i < scores.length-2; i++) {
            int a = scores[i];
            int b = scores[i+1];
            int c = scores[i+2];
            if (Math.abs(a-b) <= 2 && Math.abs(a-c) <= 2 && Math.abs(b-c) <= 2) return true;
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int halfPoint = scores.length / 2;
        return Math.max(average(scores, 0, halfPoint), average(scores, halfPoint, scores.length));
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;
        int[] halfOfScores = Arrays.copyOfRange(scores, start, end);
        for (int x : halfOfScores) {
            sum += x;
        }
        return sum / halfOfScores.length;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) count++;
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        return Arrays.copyOf(words, n);
    }



}
