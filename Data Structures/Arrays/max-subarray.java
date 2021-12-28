// https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        int c = nums[0];
        int m = nums[0];
        int i;
        for(int x=1;x<nums.length;x++) {
            i=nums[x];
            if(i>(i+c))
                c=i;
            else
                c=c+i;
            if(c>m)
                m=c;
            System.out.println(c);
            System.out.println(m);
        }
        return m;
    }
}