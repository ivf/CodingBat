public class Warmup2 {

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += str;
        return result;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        int frontLen = 3;
        if (frontLen > str.length())
            frontLen = str.length();
        String front = str.substring(0, frontLen);
        for (int i = 0; i < n; i++)
            result += front;
        return result;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        int pos = str.indexOf("x");
        if (pos == -1 || pos == str.length()-1) return false;
        if (str.charAt(pos+1) == 'x') return true;
        return false;
    }

    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            sb.append(str.substring(0, i+1));
        }
        return sb.toString();
    }

    public int last2(String str) {
        if (str.length() <= 2) return 0;
        String last = str.substring(str.length()-2);
        int count = 0;
        for (int i = 0; i < str.length()-2; i++){
            if (str.substring(i, i+2).equals(last)) count++;
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9) count++;
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int pos = 0;
        pos = nums.length <4 ? nums.length : 4;
        for (int i = 0; i < pos; i++){
            if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int minlength = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < minlength-1; i++){
            String subA = a.substring(i, i+2);
            String subB = b.substring(i, i+2);
            if (subA.equals(subB)) count++;
        }
        return count;
    }

    public String stringX(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() <= 2) return str;

        sb.append(str.charAt(0));
        for (int i = 1; i < str.length()-1; i++){
            char temp = str.charAt(i);
            if (temp != 'x') sb.append(temp);
        }
        sb.append(str.charAt(str.length()-1));

        return sb.toString();
    }

    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i+=4){
            sb.append(str.charAt(i));
            if ( (i+1) <= str.length()-1 ) sb.append(str.charAt(i+1));
        }
        return sb.toString();
    }

    public String stringYak(String str) {
        StringBuilder sb = new StringBuilder(str);

        while(true){
            int pos = sb.indexOf("yak");
            if (pos != -1)  sb.delete(pos, pos+3);
            else            break;
        }
        return sb.toString();
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i =0; i < nums.length-1; i++){
            if ( nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7) ) count++;
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length-2; i++){
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) return false;
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length-2; i++){
            int pos = nums[i];
            int pos5 = nums[i+1];
            int pos1 = nums[i+2];
            if (pos5==(pos+5) && Math.abs(pos1-(pos-1))<=2) return true;
        }
        return false;
    }

}
