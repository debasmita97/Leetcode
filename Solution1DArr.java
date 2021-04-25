/*****
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].


******/

class Solution1DArr {
    public int[] runningSum(int[] nums) {
        
        int length=nums.length;
        int [] result = new int[length];
        for(int i=0;i<length;i++)
        {
            if(i==0)
                result[i] = nums[i];
            else 
                result[i]= result[i-1]+nums[i];
        }
        
        return result;
    }
}
