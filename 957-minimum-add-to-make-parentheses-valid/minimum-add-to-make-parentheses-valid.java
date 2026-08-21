class Solution {
    public int minAddToMakeValid(String s) {
        int count1=0;
        int count=0;
        for(char ch : s.toCharArray()){
            if(ch=='(')
                count1++;
            else if(count1>0)
                count1--;
            else
                count++;
        }
        return (count1)+count;
    }
}