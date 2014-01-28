public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        String out1 = out.substring(0, 2);
        String out2 = out.substring(2, 4);
        return out1 + word + out2;
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length()-2, str.length());
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() <= 2) return str;
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    public String comboString(String a, String b) {
        String shortStr;
        String longStr;

        if (a.length() > b.length()){
            longStr = a;
            shortStr = b;
        }
        else{
            longStr = b;
            shortStr = a;
        }

        return shortStr + longStr + shortStr;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }

    public String theEnd(String str, boolean front) {
        if (front)  return str.substring(0, 1);
        else        return str.substring(str.length()-1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length()-1);
    }

    public String middleTwo(String str) {
        int halfLength = str.length() / 2;
        return str.substring(halfLength-1, halfLength+1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        if (str.length() <= n) return str+str;
        return str.substring(0, n) + str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        int pos = str.length() - index;
        if (pos < 2 || index < 0)
            return str.substring(0, 2);
        return str.substring(index, index+2);
    }

    public String middleThree(String str) {
        int mid = str.length()/2 - 1;
        return str.substring(mid, mid+3);
    }

    public boolean hasBad(String str) {
        int strLength = str.length();
        if (strLength < 3) {
            return false;
        } else if (strLength == 3) {
            return str.equals("bad");
        } else if (strLength >3) {
            return (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"));
        } else {
            return false;
        }
    }

    public String atFirst(String str) {
        int strLength = str.length();
        if (strLength >= 2) {
            return "" + str.charAt(0) + str.charAt(1);
        } else if (strLength == 1) {
            return str + '@';
        } else {
            return "@@";
        }
    }

}
