class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty())
                return false;
               char  c = stack.peek();
                if((c=='('&&ch==')')||(c=='{'&&ch=='}')||(c=='['&&ch==']')){
                    stack.pop();
                }else
                return false;
            }

        }
        return stack.isEmpty();
    }
}