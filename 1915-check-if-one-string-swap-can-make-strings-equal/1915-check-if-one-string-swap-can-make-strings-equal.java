class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int [] s1arr=new int[26];
        int[] s2arr=new int[26];
        int c=0;
        for(int i=0;i<s1.length();i++){
            char s=s1.charAt(i);
            char t=s2.charAt(i);
            if(s!=t)
            c++;
            if(c>2)
            return false;
            s1arr[s-'a']++;
            s2arr[t-'a']++;
        }
        return Arrays.equals(s1arr,s2arr);
    }
}