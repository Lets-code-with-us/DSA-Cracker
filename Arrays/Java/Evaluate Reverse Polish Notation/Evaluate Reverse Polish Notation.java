class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("*") || s.equals("+") || s.equals("-") || s.equals("/")) {
                long a = stack.pop();
                long b = stack.pop();
                long result;
                if (s.equals("*")) {
                    result = a * b;
                } else if (s.equals("+")) {
                    result = a + b;
                } else if (s.equals("-")) {
                    result = b - a;
                } else {
                    result = b / a;
                }
                stack.push(result);
            } else {
                stack.push(Long.parseLong(s));
            }
        }
        return stack.pop().intValue();
    }
}