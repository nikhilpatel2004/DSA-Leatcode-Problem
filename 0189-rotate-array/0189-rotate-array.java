class Solution {
    public void rotate(int[] arr, int k) {

        int n = arr.length;
         k = k%n; // in case k>n
        rotatearr(arr, 0 , n-1);   // Step 1: Reverse whole array
        rotatearr(arr , 0 , k-1);   // Step 2: Reverse first k elements
        rotatearr(arr, k , n-1) ;  // Step 3: Reverse rest



        
        
    }
    public static void rotatearr(int [] arr, int st , int  ed){
        while(st<ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;

        }
    }
}