class Solution {
    public long maximumTripletValue(int[] A) {
        long res=0,maxa=0,maxb=0;
        for (int a:A) {
            res=Math.max(res,1L*maxb*a);
            maxb=Math.max(maxb,maxa-a);
            maxa=Math.max(maxa,a);
        }
        return res;
    }
}
