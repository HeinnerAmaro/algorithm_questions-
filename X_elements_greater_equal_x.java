class Solution {
    public int specialArray(int[] nums) {
       int array_size = nums.length;
        
        while (array_size >= 0 )
        {
            
            int counter = 0;
            for (int i = 0 ; i < nums.length; i++)
            {
                if (nums[i] >= array_size)
                    counter++;
            }
            if (array_size == counter)
            {
                 return array_size;
            }
            else
            {
                array_size--;
            }
               
        }
        return -1;
        
    }
}

