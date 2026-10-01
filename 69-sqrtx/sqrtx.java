class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        if(x<2)
        return x;
        for(int i = 1;i<=x;i++){
            if((long)i*i==x){
                
               return  i;
            }
             else if((long)i*i>x){
               return i-1;
            }
        } 
        return 0;
    }
}