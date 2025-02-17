class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int m = 0;
        for (int num : nums) {
            m |= num;
        }
        return bt(nums, m, 0, 0);
    }

    private int bt(int[] nums, int m, int indx, int curr) {
        if (indx == nums.length) {
            return curr == m ? 1 : 0;
        }
        if (curr == m) {
            return 1 << (nums.length - indx);
        }
        return bt(nums, m, indx + 1, curr | nums[indx]) +
                bt(nums, m, indx + 1, curr);
    }
}
