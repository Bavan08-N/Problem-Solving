class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int len=s.length()+1;
        int[] a=new int[len];
        Arrays.fill(a,len);
        a[0] = 0;
        Set<String> wordSet=new HashSet<>(Arrays.asList(dictionary));
        for(int i = 1; i <len; i++){
            a[i]=a[i-1]+1;
            for(int j=1;j<=i;j++){
                String str=s.substring(i-j,i);
                if(wordSet.contains(str)) {
                    a[i]=Math.min(a[i],a[i-j]);
                }
            }
        }
        return a[len-1];        
    }
}