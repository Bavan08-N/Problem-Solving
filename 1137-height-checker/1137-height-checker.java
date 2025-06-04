class Solution {
    public int heightChecker(int[] heights) {
         int[] n= heights.clone();
        Arrays.sort(n);
        int c= 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != n[i])
                c++;
        }
        return c;
    }
}