class Solution {

  
    public int search(int[] arr, int tar) {
        return binSearch(arr, tar, 0, arr.length - 1); // Calls binSearch and returns the result
    }
    
    public int binSearch(int[] arr, int tar, int st, int ed) {
        if (st <= ed) {
            int mid = st + (ed - st) / 2; // Avoid overflow

            if (arr[mid] == tar) {
                return mid; // Found the target, return index
            } else if (arr[mid] < tar) {
                return binSearch(arr, tar, mid + 1, ed); // Search in the right half
            } else {
                return binSearch(arr, tar, st, mid - 1); // Search in the left half
            }
        }
        return -1; // Target not found
    }
}
