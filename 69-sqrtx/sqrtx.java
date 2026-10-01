class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        if(x<2)
        return x;
        int i = 1;

        while ((long)i * i <= x) {
            i++;
        }

        return i - 1;
    }
}