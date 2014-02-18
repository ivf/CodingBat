public class String3 {

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.toLowerCase().charAt(i) == 'y' || str.toLowerCase().charAt(i) == 'z') && (i == str.length()-1 || !Character.isLetter(str.charAt(i+1)))) count++;
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        String result = "";
        int removeLength = remove.length();
        for (int i = 0; i < base.length(); ) {
            if (base.length()-i >= removeLength && base.toLowerCase().substring(i, i+removeLength).equals(remove.toLowerCase())) {
                i += removeLength;
            } else {
                result += base.charAt(i);
                i++;
            }
        }
        return result;
    }

    public boolean equalIsNot(String str) {
        int countIs = count(str, "is");
        int countNot = count(str, "not");
        if (countIs == countNot) {
            return true;
        } else {
            return false;
        }
    }

    public int count(String str, String word) {
        int countWord = 0;
        for (int i = 0; i < str.length(); ) {
            int index = str.indexOf(word, i);
            if (index == -1) {
                break;
            } else {
                countWord++;
                i += index + word.length();
            }
        }
        return countWord;
    }

    public boolean gHappy(String str) {
        boolean isHappy = true;
        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) == 'g') {
                if (i+1 < str.length() && str.charAt(i+1) == 'g')
                {
                    isHappy = true;
                } else {
                    isHappy = false;
                }
                i += 2;
            }
            i++;
        }
        return isHappy;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) count++;
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    public String sameEnds(String string) {
        int stringLength = string.length();
        for (int i = stringLength / 2; i > 0; i--) {
            if (string.substring(0, i).equals(string.substring(stringLength-i))) return string.substring(0, i);
        }
        return "";
    }

    public String mirrorEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length()-1-i)) {
                result += String.valueOf(string.charAt(i));
            } else {
                break;
            }
        }
        return result;
    }

    public int maxBlock(String str) {
        int countResult = 0;
        int count = 1;
        char c;
        for (int i = 0; i < str.length()-1; i++) {
            c = str.charAt(i);
            if (c == str.charAt(i+1)) {
                count++;
            } else {
                count = 1;
            }
            if (count > countResult) {
                countResult = count;
            }
        }
        return countResult;
    }

    public int sumNumbers(String str) {
        int summa = 0;
        String number = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                number += String.valueOf(c);
                if (i == str.length()-1) summa += Integer.parseInt(number);
            } else if (number.length() != 0) {
                summa += Integer.parseInt(number);
                number = "";
            }
        }
        return summa;
    }

    public String notReplace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); ) {
            if ((i == 0 || !Character.isLetter(str.charAt(i-1))) && i+2 <= str.length() && (i+3 > str.length() || !Character.isLetter(str.charAt(i+2))) && str.charAt(i) == 'i' && str.charAt(i+1) == 's') {
                result += "is not";
                i += 2;
            } else {
                result += String.valueOf(str.charAt(i++));
            }
        }
        return result;
    }

}
