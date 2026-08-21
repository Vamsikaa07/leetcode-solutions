class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int x,y,score ;
        stack.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(0);
            }else{
                x = stack.pop();y=stack.pop();
               if(x==0)
               score=1;
               else
               score = 2*x;

               stack.push(score+y);
                
            }
        }
        return stack.peek();
    }
}