class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0) return new int[0];
        int m = temperatures.length;
        int[] res = new int[m];
        Stack<Integer> stack = new Stack<>();
        for (int i = m - 1; i >= 0; i--) {
            int index = 0;
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                index = stack.peek() - i;
            }
            stack.push(i);
            res[i] = index;
        }
        return res;
    }
}