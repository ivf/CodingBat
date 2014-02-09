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

}
