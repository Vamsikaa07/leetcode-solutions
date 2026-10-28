class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        while(sum!=1 && sum!=4){
            sum=0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n = sum;
        }

        return (sum==1);
        
    }
}