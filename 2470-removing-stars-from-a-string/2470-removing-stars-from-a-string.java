class Solution {
    public String removeStars(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stackTemp = new Stack<>();

        for (int i = 0; i < len; i++) {
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '*') {
                int c = 0;
               while(stack.peek() == '*'){
                stack.pop();
                c++;
               }
               while(c !=0){
                stack.pop();
                c--;
               }
            } else {
                stackTemp.push(stack.pop());
            }
        }
        String ans ="";
        while(!stackTemp.isEmpty()){
            ans+= stackTemp.pop();
        }
        return ans;
    }
}