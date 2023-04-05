class Solution {
    public int findDuplicate(int[] nums) {
        int counter=0,number=0;
        for(int i=0;i<nums.length;i++)
        {counter=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    counter++;
                    number=nums[j];
                }
                if(counter>1)
                return number;
            }
        }
        return 0;
    }
}