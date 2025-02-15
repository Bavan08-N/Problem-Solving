class Solution {
    public int returnToBoundaryCount(int[] nums) {
       int a=0,c=0;
        for (int num: nums) {
            a+= num;
            if (a== 0)
                c++;
        }
        return c;
    }
}