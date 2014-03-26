import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<String>();
        for (String word : words) {
            if (word.length() != len) {
                list.add(word);
            }
        }
        return list;
    }

    public boolean hasOne(int n) {
        if (n == 0) return false;
        if (n % 10 == 1) return true;
        return hasOne(n/10);
    }

    public boolean dividesSelf(int n) {
        int digit;
        int digits = n;
        while (digits != 0) {
            digit = digits % 10;
            if (digit == 0 || n % digit != 0) return false;
            digits /= 10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int iResult = 0;
        for (int i = 0; i < nums.length; i++) {
            if (iResult < count && nums[i] % 2 == 0) {
                result[iResult++] = nums[i];
            }
        }
        return result;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] result = new int[count];
        int iResult = 0;
        for (int num : nums) {
            if (iResult < count && isEndy(num)) {
                result[iResult++] = num;
            }
        }
        return result;
    }

    public boolean isEndy(int n) {
        if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) {
            return true;
        }
        return false;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                continue;
            } else if (key[i].equals(answers[i])) {
                count += 4;
            } else {
                count--;
            }
        }
        return count;
    }

    public String[] wordsWithout(String[] words, String target) {
        ArrayList<String> list = new ArrayList<String>();
        for (String word : words) {
            if (!word.equals(target)) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public int scoresSpecial(int[] a, int[] b) {
        return largest(a) + largest(b);
    }

    public int largest(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 10 == 0 && num > result) result = num;
        }
        return result;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i+1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i] < heights[i+1]) {
                sum += Math.abs(heights[i] - heights[i+1]) * 2;
            } else {
                sum += Math.abs(heights[i] - heights[i+1]);
            }
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i+1]) >= 5) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int name = aName.compareTo(bName);
        if (name < 0) {
            return -1;
        } else if (name > 0) {
            return 1;
        } else {
            if (aId < bId) {
                return -1;
            } else if (aId > bId) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = Arrays.copyOf(a, n);
        for (int i = 0; i < n; i++) {                      //b
            for (int j = 0; j < n; j++) {                  //a
                if (b[i].compareTo(result[j]) == 0) {
                    break;
                } else if (b[i].compareTo(result[j]) < 0) {
                    String insertString = b[i];
                    String nextString;
                    for (int k = j; k < n; k++) {
                        nextString = result[k];
                        result[k] = insertString;
                        insertString = nextString;
                    }
                    break;
                }
            }
        }
        return result;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        String next = "";
        int nextJ = 0;
        for (int i = 0; i < a.length; i++) {
            if (next.equals(a[i])) {
                continue;
            } else {
                for (int j = nextJ; j < b.length; j++) {
                    if (next.equals(b[j])) {
                        continue;
                    } else if (a[i].compareTo(b[j]) == 0) {
                        count++;
                        next = a[i];
                        nextJ = j+1;
                        break;
                    } else if (a[i].compareTo(b[j]) < 0) {
                        break;
                    }
                }
            }
        }
        return count;
    }

}
