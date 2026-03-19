class Solution {
    public String reverseWords(String s) {
         StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                if(sb.length()>0){
                stack.push(sb);
                }
                sb = new StringBuilder();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        stack.push(sb);
        sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            if(!stack.isEmpty()){
                sb.append(" ");
            }
        }
        String ans = sb.toString();
        return ans.trim();
    }
}