import sun.management.resources.agent_de;

public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > big*5 + small) return false;
        if (goal % 5 > small) return false;
        return true;
    }

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
        } else {
            return sum;
        }
        if (b != 13) {
            sum += b;
        } else {
            return sum;
        }
        if (c != 13) {
            sum += c;
        } else {
            return sum;
        }
        return sum;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n == 15 || n == 16 || n < 13 || n > 19) return n;
        return 0;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int remainder = num % 10;
        num -= remainder;
        if (remainder >= 5) return num + 10;
        return num;
    }

    public boolean closeFar(int a, int b, int c) {
        if ((Math.abs(a - b) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - c) >= 2) ||
            (Math.abs(a - c) <= 1 && Math.abs(b - c) >= 2 && Math.abs(a - b) >= 2)) {
            return true;
        }
        return false;
    }

    public int blackjack(int a, int b) {
        int aDif = a;
        if (aDif > 21) aDif = 0;
        int bDif = b;
        if (bDif > 21) bDif = 0;
        if (aDif > bDif) {
            return aDif;
        } else {
            return bDif;
        }
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int[] arr = new int[] {a, b, c};
        for (int j = 0; j < arr.length - 1; j++){
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        if (arr[2] - arr[1] == arr[1] - arr[0]) return true;
        return false;
    }

    public int makeChocolate(int small, int big, int goal) {
        int bigCho = goal / 5;
        if (big < bigCho) {
            if (big*5 + small >= goal) {
                return goal - big*5;
            } else {
                return -1;
            }
        } else {
            if (small - (goal % 5) >= 0) {
                return goal % 5;
            } else {
                return -1;
            }
        }
    }

}
