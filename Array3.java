import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {

    public int maxSpan(int[] nums) {
        if (nums.length == 0) return 0;
        int count = 1;
        int endPos = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) endPos = j;
            }
            if (endPos != 0 && endPos-i+1 > count) count = endPos-i+1;
            endPos = 0;
        }
        return count;
    }

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                }
                i++;
            } else if (nums[i] == 4) {
                for (int j = i+1; j < nums.length-1; j++) {
                    if (nums[j] == 3 && nums[j+1] != 4) {
                        int temp = nums[j+1];
                        nums[j+1] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        int temp = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = temp;
                    }
                }
                i++;
            } else if (nums[i] == 5) {
                for (int j = i+1; j < nums.length-1; j++) {
                    if (nums[j] == 4 && nums[j+1] != 5) {
                        int temp = nums[j+1];
                        nums[j+1] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int x : nums) {
            sumRight += x;
        }
        for (int x : nums) {
            sumLeft += x;
            sumRight -= x;
            if (sumLeft == sumRight) return true;
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        for (int target : inner) {
            if (Arrays.binarySearch(outer, target) < 0) {
                return false;
            }
        }
        return true;
    }

    public int[] squareUp(int n) {
        int length = n * n;
        int[] result = new int[length];
        Arrays.fill(result, 0);
        for (int i = 1; i <= n; i++) {
            for (int j = n*i-i; j < length; j += n) {
                result[j] = i;
            }
        }
        return result;
    }

    public int[] seriesUp(int n) {
        int length = n*(n+1)/2;
        int[] result = new int[length];
        int position = 0;
        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= i; j++, position++) {
                result[position] = j;
            }
        }
        return result;
    }

    public int maxMirror(int[] nums) {
        int length = nums.length;
        int count = 0;
        ArrayList<Integer> before;
        ArrayList<Integer> after;
        for (int i = 0; i < length; i++) {
            after = new ArrayList<Integer>();
            for (int j = length-1-i; j >= 0; j--) {
                after.add(nums[j]);
                for (int k = 0; k < length; k++) {
                    before = new ArrayList<Integer>();
                    for (int m = k; m < length; m++) {
                        before.add(nums[m]);
                        if (before.equals(after) && before.size() > count) {
                            count = before.size();
                        }
                    }
                }
            }
        }
        return count;
    }

    public int countClumps(int[] nums) {
        int count = 0;
        boolean isClump = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (list.isEmpty()) {
                list = new ArrayList<Integer>();
                list.add(nums[i]);
            } else if (list.contains(nums[i])) {
                isClump = true;
                list.add(nums[i]);
                if (i == nums.length-1) {
                    count++;
                }
            } else if (isClump) {
                count++;
                isClump = false;
                list = new ArrayList<Integer>();
                list.add(nums[i]);
            } else {
                list = new ArrayList<Integer>();
                list.add(nums[i]);
            }
        }
        return count;
    }

}
