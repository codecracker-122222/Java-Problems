public class Solution1{
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for(int i=1;i<n;i++){
            res[i] = res[i-1] * nums[i-1]; 
        }
        int rightProduct = 1;
        for(int i=n-1;i>=0;i--){
            res[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] input = {2,3,0,4};
        int[] output = sol.productExceptSelf(input);
        for(int num : output){
            System.out.print(num + " ");
        }
    }
}
