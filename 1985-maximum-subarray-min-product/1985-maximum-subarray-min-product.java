import java.util.*;

class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        long mod = 1000000007;

        // Compute prefix sum
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Find next smaller element
        int[] nextSmaller = new int[n];
        Arrays.fill(nextSmaller, n);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Find previous smaller element
        int[] prevSmaller = new int[n];
        Arrays.fill(prevSmaller, -1);
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                prevSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }

        // Calculate max min-product
        long maxProduct = 0;
        for (int i = 0; i < n; i++) {
            int left = prevSmaller[i] + 1;
            int right = nextSmaller[i] - 1;
            long sum = prefixSum[right + 1] - prefixSum[left];
            maxProduct = Math.max(maxProduct, sum * nums[i]);
        }

        return (int) (maxProduct % mod);
    }
}
