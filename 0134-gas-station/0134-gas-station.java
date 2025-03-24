class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0, currentFuel = 0, startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalFuel += gas[i] - cost[i];
            currentFuel += gas[i] - cost[i];

            // अगर current balance negative हो गया, तो यह स्टेशन सही नहीं है
            if (currentFuel < 0) {
                startIndex = i + 1;  // नए स्टेशन से शुरुआत करेंगे
                currentFuel = 0;      // balance reset कर देंगे
            }
        }
        return (totalFuel >= 0) ? startIndex : -1;
    }
}
