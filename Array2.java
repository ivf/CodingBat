import java.util.Arrays;

public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int big = nums[0];
        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            big = Math.max(big, nums[i]);
            small = Math.min(small, nums[i]);
        }
        return Math.abs(big-small);
    }

    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return (sum - max - min) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean is67 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                is67 = true;
                continue;
            } else if (nums[i] == 7 && is67) {
                is67 = false;
                continue;
            }
            if (is67) continue;
            sum += nums[i];
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) sum2 += 2;
        }
        return sum2 == 8 ? true : false;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
                continue;
            } else if (nums[i] == 4) {
                count4++;
                continue;
            }
        }
        return count1 > count4 ? true : false;
    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) continue;
            return false;
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean is1 = false;
        boolean is4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                is1 = true;
            } else if (nums[i] == 4) {
                is4 = true;
            }
        }
        return !(is1 && is4);
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == val || nums[i+1] == val) continue;
            return false;
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean is22 = false;
        boolean is44 = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                is22 = true;
            } else if (nums[i] == 4 && nums[i+1] == 4) {
                is44 = true;
            }
        }
        return (is22 && !is44) || (!is22 && is44);
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) == 1 || Math.abs(nums1[i] - nums2[i]) == 2) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 7 && (nums[i+1] == 7 || (i+2 <= nums.length-1 && nums[i+2] == 7))) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean is1 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                is1 = true;
            } else if (is1 && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) || (nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1)) return true;
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (i+1 < nums.length && nums[i+1] == 3) {
                    count = 0;
                } else {
                    count++;
                }
            }
        }
        return count == 3;
    }

    public boolean twoTwo(int[] nums) {
        boolean is2 = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if ((i+1 == nums.length || nums[i+1] != 2) && (i == 0 || nums[i-1] != 2)) {
                    is2 = false;
                    i++;
                } else {
                    is2 = true;
                    i++;
                }
            }
        }
        return is2;
    }

    public boolean sameEnds(int[] nums, int len) {
        int[] start = Arrays.copyOf(nums, len);
        int[] end = Arrays.copyOfRange(nums, nums.length-len, nums.length);
        return Arrays.equals(start, end);
    }

    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1]-1 && nums[i+1] == nums[i+2]-1) return true;
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int length = end - start;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = start++;
        }
        return result;
    }

    public int[] shiftLeft(int[] nums) {
        int length = nums.length;
        if (length == 0) return nums;
        int[] result = Arrays.copyOfRange(nums, 1, length+1);
        result[length-1] = nums[0];
        return result;
    }

    public int[] tenRun(int[] nums) {
        boolean isMultiple = false;
        int multiple10 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multiple10 = nums[i];
                isMultiple = true;
                continue;
            }
            if (isMultiple) {
                nums[i] = multiple10;
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int position4 = Arrays.binarySearch(nums, 4);
        return Arrays.copyOf(nums, position4);
    }

    public int[] post4(int[] nums) {
        int positionLast4 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) positionLast4 = i;
        }
        return Arrays.copyOfRange(nums, positionLast4 + 1, nums.length);
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i] == val && nums[i-1] != val && nums[i+1] != val) nums[i] = Math.max(nums[i-1], nums[i+1]);
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int iResult = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[--iResult] = nums[i];
            }
        }
        Arrays.fill(result, 0, iResult, 0);
        return result;
    }

    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int iResult = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) result[iResult++] = nums[i];
        }
        Arrays.fill(result, iResult, result.length, 0);
        return result;
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxOdd) maxOdd = nums[j];
                }
                nums[i] = maxOdd;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int iResultLeft = 0;
        int iResultRight = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[iResultLeft++] = nums[i];
            } else {
                result[--iResultRight] = nums[i];
            }
        }
        return result;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end-start];
        for (int i = 0; i < result.length; i++, start++) {
            if (start % 3 == 0 && start % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                result[i] = "Fizz";
            } else if (start % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(start);
            }
        }
        return result;
    }

}
