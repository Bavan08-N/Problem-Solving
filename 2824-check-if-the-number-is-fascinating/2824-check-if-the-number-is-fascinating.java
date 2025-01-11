class Solution {
    public boolean isFascinating(int n1) {
        boolean[] fa=new boolean[10];
        int n2 =2*n1;
        int n3 =3*n1;
        while(n1>0){
            fa[n1%10]=true;
            fa[n2%10]=true;
            fa[n3%10]=true;
            n1/=10;
            n2/=10;
            n3/=10;
        }
        for(int i=1;i<10;i++)
           if(!fa[i]) 
           return false;
        return true;
    }
}