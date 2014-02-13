public class String2 {

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += "" + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i+2).equals("hi")) count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+3).equals("cat")) {
                countCat++;
            } else if (str.substring(i, i+3).equals("dog")) {
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i+2).equals("co") && str.charAt(i+3) == 'e') count++;
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        if (a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase())) {
            return true;
        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.length() < 3) return false;
        if (str.substring(0, 3).equals("xyz")) return true;
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.substring(i, i+3).equals("xyz") && str.charAt(i-1) != '.') return true;
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        boolean x = false;
        boolean y = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                x = true;
                y = false;
            }
            if (str.charAt(i) == 'y' && x) {
                x = false;
                y = true;
            }
        }
        return y;
    }

    public String mixString(String a, String b) {
        String result = "";
        int length;
        if (a.length() > b.length()) {
            length = a.length();
        } else {
            length = b.length();
        }
        for (int i = 0; i < length; i++) {
            if (i < a.length()) result += "" + a.charAt(i);
            if (i < b.length()) result += "" + b.charAt(i);
        }
        return result;
    }

    public String repeatEnd(String str, int n) {
        String result = "";
        int length = str.length();
        for (int i = 0; i < n; i++) {
            result += str.substring(length-n);
        }
        return result;
    }

    public String repeatFront(String str, int n) {
        String result = "";
        while (n >= 0) {
            result += str.substring(0, n--);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count > 0) result = word;
        for (int i = 1; i < count; i++) {
            result += sep + word;
        }
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String pref = str.substring(0, n);
        return str.substring(n).contains(pref);
    }

    public boolean xyzMiddle(String str) {
        int first = -1;
        int end = -1;
        int difference = 0;
        int length = str.length();
        for (int i = 0; i <= length - 3; i++) {
            if (str.substring(i, i+3).equals("xyz")) {
                first = i;
                end = length - i - 3;
                difference = Math.abs(first - end);
                if (difference >= 0 && difference <= 1) return true;
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        int begin = str.indexOf("bread");
        int end = str.lastIndexOf("bread");
        if (begin != end) return str.substring(begin+5, end);
        return "";
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) return false;
        }
        return true;
    }

    public String zipZap(String str) {
        if (str.length() <= 1) return str;
        String result = "" + str.charAt(0);
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i-1) != 'z' || str.charAt(i+1) != 'p') result += str.charAt(i);
        }
        return result + str.charAt(str.length()-1);
    }

    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() <= 1 && str.charAt(i) != '*') {
                result += str.charAt(i);
            } else {
                if (i == 0 && str.charAt(i) != '*' && str.charAt(i+1) != '*') {
                    result += str.charAt(i);
                } else if (i == str.length()-1 && str.charAt(i) != '*' && str.charAt(i-1) != '*') {
                    result += str.charAt(i);
                } else if (i != 0 && i != str.length()-1 && str.charAt(i-1) != '*' && str.charAt(i+1) != '*' && str.charAt(i) != '*') {
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }

    public String plusOut(String str, String word) {
        String result = "";
        int wordLength = word.length();
        for (int i = 0; i < str.length(); ) {
            if (str.indexOf(word, i) == i) {
                result += word;
                i += wordLength;
            } else {
                result += '+';
                i++;
            }
        }
        return result;
    }

    public String wordEnds(String str, String word) {
        String result = "";
        if (word.length() == str.length()) return "";
        for (int i = 0; i < str.length(); ) {
            if (str.indexOf(word, i) == i) {
                if (i == 0) {
                    result += "" + str.charAt(i+word.length());
                } else if (i == str.length()-word.length()) {
                    result += "" + str.charAt(i-1);
                    i += word.length();
                } else {
                    result += "" + str.charAt(i-1) + str.charAt(i+word.length());
                    i += word.length() - 1;
                }
            }
            i++;
        }
        return result;
    }

}
