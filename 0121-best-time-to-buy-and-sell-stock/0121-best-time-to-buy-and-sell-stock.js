/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let n = prices.length
    let min  = Number.MAX_VALUE;
    let max = 0;

    for(let i = 0; i<n; i++){
       let cost = prices[i]-min;
       max=  Math.max(max,cost);
       min = Math.min(min, prices[i]);
    }
    return max;
        };