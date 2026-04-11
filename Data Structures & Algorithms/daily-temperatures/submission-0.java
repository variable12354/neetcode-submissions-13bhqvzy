class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];
        for(int i = 0;i<length;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
