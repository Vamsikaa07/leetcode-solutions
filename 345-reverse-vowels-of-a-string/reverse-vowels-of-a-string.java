class Solution {
    public String reverseVowels(String s) {
       
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
                st.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char x = s.charAt(i);
            if((x!='a'&& x!='e'&& x!='i'&& x!='o'&& x!='u'&& x!='A'&& x!='E'&& x!='I'&& x!='O'&& x!='U')){
                sb.append(s.charAt(i));
            }else
            sb.append(st.pop());
        }
        return sb.toString();
    }
}