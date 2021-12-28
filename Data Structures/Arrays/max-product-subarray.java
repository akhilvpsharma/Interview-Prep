// https://leetcode.com/problems/maximum-product-subarray/
class Solution {
    public int maxProduct(int[] nums) {
        int r = nums[0];
        int m = nums[0];
        int min = nums[0];
        int n;
        for(int i=1;i<nums.length;i++) {
            n = nums[i];
            int temp=m;
            m = Math.max(Math.max(m * n, min * n), n);
            min = Math.min(Math.min(temp * n, min * n), n);
            if(r<m)
                r=m;
            System.out.println(r);
            System.out.println(m);
                         System.out.println(min);
        }
        return r;
    }
}