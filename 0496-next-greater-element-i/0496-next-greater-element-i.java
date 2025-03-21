class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> Map = new HashMap<>();
    Stack<Integer> s = new Stack<>();

    for (int num : nums2) {
    while (!s.isEmpty() && s.peek() < num) {
        Map.put(s.pop(), num);
    }
    s.push(num);
}
      int[] result = new int[nums1.length];  //  Create result array
      for (int i = 0; i < nums1.length; i++) { //  Iterate through nums1
      result[i] = Map.getOrDefault(nums1[i], -1);  // Fetch next greater   element or -1
}
    return result;  //  Return the result array


    }
}