class Solution {
    public int secondHighest(String s) {
        int c=1;
        for(char i='9';i>='0';i--){
            if(s.indexOf(i)!=-1){
                if(c--<=0){
                    return i-'0';
                }
            }
        }
        return -1;
    }
}