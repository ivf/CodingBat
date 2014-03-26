public class Recursion2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupSum(start + 1, nums, target - nums[start])) return true;
        if (groupSum(start + 1, nums, target)) return true;
        return false;
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (nums[start] == 6) {
            if (groupSum6(start + 1, nums, target - 6)) return true;
        } else {
            if (groupSum6(start + 1, nums, target - nums[start])) return true;
            if (groupSum6(start + 1, nums, target)) return true;
        }
        return false;
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupNoAdj(start + 2, nums, target - nums[start])) return true;
        if (groupNoAdj(start + 1, nums, target)) return true;
        return false;
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (nums[start] % 5 == 0) {
            if (groupSum5(start + 1, nums, target - nums[start])) return true;
        } else if (start != 0 && nums[start] == 1 && nums[start - 1] % 5 == 0) {
            if (groupSum5(start + 1, nums, target)) return true;
        } else {
            if (groupSum5(start + 1, nums, target)) return true;
            if (groupSum5(start + 1, nums, target - nums[start])) return true;
        }
        return false;
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        int sum = nums[start];
        for (int i = start; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[start]) {
                sum += nums[i];
            } else {
                break;
            }
        }
        if (sum == nums[start]) {
            if (groupSumClump(start + 1, nums, target)) return true;
            if (groupSumClump(start + 1, nums, target - nums[start])) return true;
        } else {
            if (groupSumClump(start + (sum / nums[start]), nums, target - sum)) return true;
            if (groupSumClump(start + (sum / nums[start]), nums, target)) return true;
        }
        return false;
    }

}
