public class Array1 {

    public boolean firstLast6(int[] nums) {
        if (nums.length >= 1 && (nums[0] == 6 || nums[nums.length-1] == 6)) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length-1]) {
            return true;
        }
        return false;
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
            return true;
        }
        return false;
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[] {nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            return new int[] {nums[0], nums[0], nums[0]};
        } else {
            return new int[] {nums[2], nums[2], nums[2]};
        }
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length < 2) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        int numsLength = nums.length;
        if (numsLength == 0) {
            return null;
        } else {
            return new int[] {nums[0], nums[numsLength-1]};
        }
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        boolean isContain = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                isContain = false;
            }
        }
        return isContain;
    }

    public int[] makeLast(int[] nums) {
        int[] numsLast = new int[nums.length * 2];
        numsLast[numsLast.length-1] = nums[nums.length-1];
        return numsLast;
    }

    public boolean double23(int[] nums) {
        if (nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3))) {
            return true;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] ==3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        if (sumA >= sumB) {
            return a;
        } else {
            return b;
        }
    }

    public int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2;
        return new int[] {nums[middle-1], nums[middle]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length > 1) {
            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            nums[nums.length-1] = temp;
        }
        return nums;
    }

    public int[] midThree(int[] nums) {
        int middle = nums.length / 2;
        return new int[] {nums[middle-1], nums[middle], nums[middle+1]};
    }

    public int maxTriple(int[] nums) {
        int max = nums[0];
        if (nums.length > 1) {
            int middle = nums.length / 2;
            if (nums[middle] > max) {
                max = nums[middle];
            }
            if (nums[nums.length-1] > max) {
                max = nums[nums.length-1];
            }
        }
        return max;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length > 1) {
            return new int[] {nums[0], nums[1]};
        } else {
            return nums;
        }
    }

    public boolean unlucky1(int[] nums) {
        int length = nums.length;
        if (length == 2 && (nums[0] == 1 && nums[1] == 3)) {
            return true;
        } else if (length >= 3 && ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[length-2] == 1 && nums[length-1] == 3))) {
            return true;
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        if (a.length == 0) {
            return new int[] {b[0], b[1]};
        } else if (a.length == 1) {
            return new int[] {a[0], b[0]};
        } else {
            return new int[] {a[0], a[1]};
        }
    }

    public int[] front11(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;
        if (aLength == 0 && bLength == 0){
            return new int[] {};
        } else if (aLength != 0 && bLength == 0) {
            return new int[] {a[0]};
        } else if (aLength == 0 && bLength != 0) {
            return new int[] {b[0]};
        } else {
            return new int[] {a[0], b[0]};
        }
    }

}
