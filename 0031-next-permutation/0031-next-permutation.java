import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: Find pivot Right से ऐसा पहला element ढूंढना जो अपने अगले से छोटा हो
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse entire array  अगर ऐसा कोई element नहीं मिला, तो पूरी array को उल्टा कर दो
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element on right of pivot Pivot के दाएँ सबसे छोटा बड़ा element ढूंढना
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the suffix Pivot के बाद वाले हिस्से को उल्टा कर दो (ascending में लाना)
        reverse(nums, pivot + 1, n - 1);
    }
 
    // Utility to reverse array between two indices एक हिस्से को उल्टा करना
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    // Utility to swap two elements दो index के elements को बदलना
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
