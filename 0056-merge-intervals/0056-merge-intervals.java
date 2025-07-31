class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse and merge
        for (int[] interval : intervals) {
            // If merged list is empty OR no overlap
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(interval);  // Add as-is
            } else {
                // Merge with the last interval
                merged.get(merged.size() - 1)[1] = Math.max(
                    merged.get(merged.size() - 1)[1], interval[1]
                );
            }
        }

        // Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}
