public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ( aSmile && bSmile ) || ( !aSmile && !bSmile );
    }

    public int sumDouble(int a, int b) {
        return ( a == b ) ? (a+b)*2 : a+b;
    }

    public int diff21(int n) {
        if (n <= 21)    return 21 - n;
        else            return (n - 21) * 2;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return ( !( (7 <= hour) && (hour <= 20) ) && talking);
    }

    public boolean makes10(int a, int b) {
        return ( (a==10) || (b==10) || ((a+b)==10) );
    }

    public boolean nearHundred(int n) {
        return ( ( (Math.abs(100-n)) <= 10 ) || ( (Math.abs(200-n)) <= 10 ) );
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ( a<0 && b<0 && negative) return true;
        if ( ( ( a<0 && b>0 ) || ( a>0 && b<0 ) ) && !negative ) return true;
        return false;
    }

    public String notString(String str) {
        if ( (str.length() >= 3) && (str.substring(0, 3).equalsIgnoreCase("not")) ) return str;
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1);
        return front+back;
    }

    public String frontBack(String str) {
        if (str.isEmpty()) return "";
        if (str.length() == 1) return str;
        char front = str.charAt(0);
        char back = str.charAt(str.length()-1);
        return back + str.substring(1, str.length()-1) + front;
    }

    public String front3(String str) {
        String front;
        if (str.length() < 3)   front = str;
        else                    front = str.substring(0, 3);
        return front + front + front;
    }

    public String backAround(String str) {
        char ch = str.charAt(str.length()-1);
        return ch + str + ch;
    }

    public boolean or35(int n) {
        return ( (n >0) && ( (n%3==0) || (n%5==0) ) );
    }

    public String front22(String str) {
        if (str.length() < 2) return str + str + str;
        String s = str.substring(0, 2);
        return s + str + s;
    }

    public boolean startHi(String str) {
        if (str.length()>=2 && str.substring(0, 2).equalsIgnoreCase("hi")) return true;
        else return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        return  ( (temp1<0 && temp2>100) || (temp1>100 && temp2<0) );
    }

    public boolean in1020(int a, int b) {
        return ( (a>=10 && a<=20) || (b>=10 && b<=20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) ||
                (b>=13 && b<=19) ||
                (c>=13 && c<=19);
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a>=13 && a<=19);
        boolean bTeen = (b>=13 && b<=19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del"))
            return str.substring(0, 1) + str.substring(4);
        return str;
    }

    public boolean mixStart(String str) {
        return str.length()>=3 && str.substring(1, 3).equals("ix");
    }

    public String startOz(String str) {
        String result = "";
        if (str.length()>=1 && str.charAt(0)=='o') result += str.charAt(0);
        if (str.length()>=2 && str.charAt(1)=='z') result += str.charAt(1);
        return result;
    }

    public int intMax(int a, int b, int c) {
        int max = a;
        max = max < b ? b : max;
        max = max < c ? c : max;
        return max;
    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(10 - a);
        int bDiff = Math.abs(10 - b);
        if (aDiff < bDiff) return a;
        if (aDiff > bDiff) return b;
        return 0;
    }

    public boolean in3050(int a, int b) {
        if (a>=30 && a<=40 && b>=30 && b<=40) return true;
        if (a>=40 && a<=50 && b>=40 && b<=50) return true;
        return false;
    }

    public int max1020(int a, int b) {
        if (a < b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a>=10 && a<=20) return a;
        if (b>=10 && b<=20) return b;
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'e') count++;
        return count>=1 && count<=3;
    }

    public boolean lastDigit(int a, int b) {
        return (a%10) == (b%10);
    }

    public String endUp(String str) {
        if (str.length()>=3) return str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase();
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i+=n)
            newStr += str.charAt(i);
        return newStr;
    }

}
