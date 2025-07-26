class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0; 
        int l = 0; //left pointer
        int  r =n-1; // right pointer
         int lmax = 0;
         int rmax = 0;

         while(l<r){
            lmax =Math. max(lmax, height[l]);
            rmax = Math.max(rmax , height[r]);


            if(lmax<rmax){
                ans+= lmax-height[l];
                l++;
            }else{
                ans+= rmax- height[r];
                r--;
            }

         }
         return ans;

        
    }
}

  

  // prefix Array method




// class Solution {
//     public int trap(int[] height) {
//         //left max boundary
//         int n= height.length;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n;i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }
//         //right max boundary
//         int rightMax[] = new int[n];
//         rightMax[n-1]= height[n-1];
//         for(int i = n-2;i>=0;i--){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]);
//         }
//         int trap =0;
//         for(int i=0;i<n;i++){
//             int waterLevel = Math.min(leftMax[i],rightMax[i]);
//             trap += waterLevel-height[i];
//         }
//         return trap;
//     }
// }