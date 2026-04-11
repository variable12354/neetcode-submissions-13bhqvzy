class Solution {
    public boolean isValid(String s) {

        Stack<Character> item = new Stack<>();
        for(char ch:s.toCharArray()){

            if(ch == '(' || ch == '[' || ch == '{'){
                item.push(ch);
            }else{
                if(item.isEmpty()) return false;
                
                char top = item.pop();

                if((ch == ')' && top != '(') ||
                (ch == ']' && top != '[') ||
                (ch == '}' && top != '{')){
                    return false;
                } 
            
            }
        }
        return item.isEmpty();
    }
}
