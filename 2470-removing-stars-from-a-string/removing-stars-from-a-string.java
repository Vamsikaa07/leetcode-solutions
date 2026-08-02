class Solution {
    public String removeStars(String s) {
       StringBuilder sb = new StringBuilder();
       for(char x : s.toCharArray()){
        if(x=='*'){
            sb.deleteCharAt(sb.length()-1);
        }else
        sb.append(x);
       }
       return sb.toString();
    }
}