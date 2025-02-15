class Solution {
    public long flowerGame(int n, int m) {
        long a=(long)m,b=(long)n;
        long res=0;
        res+=(b+1)/2*(a/2);
        res+=(b/2)*((a+1)/2);
        return res;
    }
}