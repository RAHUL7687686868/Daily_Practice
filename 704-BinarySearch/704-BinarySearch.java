// Last updated: 8/17/2025, 10:42:41 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            switch(op){
                case "+":
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                break;
                case "D":
                stack.push(stack.peek()*2);
                break;
                case "C":
                stack.pop();
                break;
                default:
                stack.push(Integer.parseInt(op));
                break;
            }
        }
        int sum = 0;
        for(int score : stack){
            sum += score;
        }
        return sum;
    }
}