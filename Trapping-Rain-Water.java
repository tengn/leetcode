class Solution {
    public int trap(int[] height) {
        
        // stack, hard to understand but should be useful
        // also there is DP, brute force and two pointer
        Stack<Integer> data = new Stack<>();
        int len = height.length;
        int res = 0;
        if (len == 0) return 0;
        int start = 0;
        while (start < len) {
            if (data.isEmpty() || height[start] <= height[data.peek()]) {
                data.push(start++);
            } else {
                int cur = data.pop();
                if (!data.isEmpty()) {
                    res += (Integer.min(height[data.peek()], height[start]) - height[cur]) * (start - data.peek() -1);
                }
            }
        }
        return res;
    }
}
