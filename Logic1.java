public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else if (!isWeekend && cigars >= 40 && cigars <= 60) {
            return true;
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <=2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if ((!isSummer && temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100)) {
            return true;
        }
        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 66) {
                return 0;
            } else if (speed >= 67 && speed <= 86) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 61) {
                return 0;
            } else if (speed >= 61 && speed <= 81) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            } else {
                return "off";
            }
        } else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            } else {
                return "10:00";
            }
        }
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if ((outsideMode && (n <= 1 || n >= 10)) || (!outsideMode && n >= 1 && n <= 10)) {
            return true;
        }
        return false;
    }

    public boolean specialEleven(int n) {
        int temp = n % 11;
        if (temp == 0 || temp == 1) {
            return true;
        }
        return false;
    }

    public boolean more20(int n) {
        int temp = n % 20;
        if (temp == 1 || temp == 2) {
            return true;
        }
        return false;
    }

    public boolean old35(int n) {
        boolean old3 = (n % 3) == 0;
        boolean old5 = (n % 5) == 0;
        if ((old3 && !old5) || (!old3 && old5)) {
            return true;
        }
        return false;
    }

    public boolean less20(int n) {
        if (((n+1)%20 == 0) || ((n+2)%20 == 0)) {
            return true;
        }
        return false;
    }

    public boolean nearTen(int num) {
        if (((num+2)%10 == 0) || ((num-2)%10 == 0) || ((num+1)%10 == 0) || ((num-1)%10 == 0) || (num%10 == 0)) {
            return true;
        }
        return false;
    }

    public int teenSum(int a, int b) {
        int sum = a + b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return sum;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && !isAsleep) {
            if (isMom) {
                return true;
            }
        } else {
            if (!isAsleep) {
                return true;
            }
        }
        return false;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea*2 <= candy || candy*2 <= tea) {
            return 2;
        } else {
            return 1;
        }
    }

    public String fizzString(String str) {
        StringBuilder result = new StringBuilder();
        if (str.startsWith("f")) {
            result.append("Fizz");
        }
        if (str.endsWith("b")) {
            result.append("Buzz");
        }
        if (result.length() == 0) {
            result.append(str);
        }
        return result.toString();
    }

    public String fizzString2(int n) {
        boolean fizz = (n % 3 == 0);
        boolean buzz = (n % 5 == 0);
        if (fizz && buzz) return "FizzBuzz!";
        if (fizz) return "Fizz!";
        if (buzz) return "Buzz!";
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        boolean ab = a + b == c;
        boolean ac = a + c == b;
        boolean bc = b + c == a;
        if (ab || ac || bc) return true;
        return false;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean abc = b > a && c > b;
        boolean bc = c > b;
        if (abc) return true;
        if (bOk && bc) return true;
        return false;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean abcExactly = a < b && b < c;
        boolean abcNotExactly = a <= b && b <= c;
        if (abcExactly) return true;
        if (equalOk && abcNotExactly) return true;
        return false;
    }

    public boolean lastDigit(int a, int b, int c) {
        boolean ab = (a % 10) == (b % 10);
        boolean ac = (a % 10) == (c % 10);
        boolean bc = (b % 10) == (c % 10);
        if (ab || ac || bc) return true;
        return false;
    }

    public boolean lessBy10(int a, int b, int c) {
        boolean a10 = a - 10 >= b || a - 10 >= c;
        boolean b10 = b - 10 >= a || b - 10 >= c;
        boolean c10 = c - 10 >= a || c - 10 >= b;
        if (a10 || b10 || c10) return true;
        return false;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                return die1 + 1;
            } else {
                return die1 * 2 + 1;
            }
        } else {
            return die1 + die2;
        }
    }

    public int maxMod5(int a, int b) {
        boolean remainderIsSame = a % 5 == b % 5;
        boolean isSame = a == b;
        if (isSame) return 0;
        if (remainderIsSame) {
            if (a > b) return b;
            else return a;
        } else {
            if (a > b) return a;
            else return b;
        }
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c ==2) return 10;
        if (a == b && b == c) return 5;
        if (b != a && c != a) return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) return 20;
        if (a != b && b != c && a != c) return 0;
        return 10;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab == ac + 10 || ab == bc + 10) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        if ((a / 10 == b % 10) ||
            (b / 10 == a % 10) ||
            (a / 10 == b / 10) ||
            (a % 10 == b % 10)) return true;
        return false;
    }

    public int sumLimit(int a, int b) {
        int aLength = String.valueOf(a).length();
        int sum = a + b;
        int sumLength = String.valueOf(sum).length();
        if (aLength == sumLength) return sum;
        return a;
    }

}
