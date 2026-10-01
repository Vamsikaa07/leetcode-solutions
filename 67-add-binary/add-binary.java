class Solution {
    public String addBinary(String a, String b) {
    
        int x = a.length();
        int y = b.length();

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(x>0||y>0||carry==1){
            int bitA = 0;
            int bitB =0;
            if(x>0){
                 bitA = a.charAt(x-1) - '0';
            }
            if(y>0){
                 bitB = b.charAt(y-1) - '0';
            }
            int sum = bitA+bitB+carry;
            
            sb.append(sum%2);
            carry = sum/2;
            x--;y--;
           
        }
        

       sb.reverse();
       return sb.toString();


    }
}