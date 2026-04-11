class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){

            if(token.equals("+")){
                int a = stack.pop(); // this one is b
                int b = stack.pop(); //this one is a
                stack.push(b + a); 
            }

            else if(token.equals("*")){
                int a = stack.pop(); // this one is b
                int b = stack.pop(); //this one is a
                stack.push(b * a); 
            }

            else if(token.equals("-")){
                int a = stack.pop(); // this one is b
                int b = stack.pop(); //this one is a
                stack.push(b - a); 
            }
            else if(token.equals("/")){
                int a = stack.pop(); // this one is b
                int b = stack.pop(); //this one is a
                stack.push(b / a); 
            }
            else{
                stack.push(Integer.parseInt(token));
            }


        }

        return stack.pop();

        
    }
}
