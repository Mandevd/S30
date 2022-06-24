/**
 Even if the sorted array is rotated. One side (either left or right) of mid will always be sorted
 We will use modified binary serach. Calculate mid if our target is at mid then simple return the mid
 If we target is not at the mid then use the sorted part of the array to move left and right pointers.
 by checking if the target is lying in sorted part of the array.

 Time Complexity: log(n). Space: Complexity: O(1)
 */


public class RotatedArray {

    public int Search(int[]nums,int target)
    {
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[low]<nums[mid])//left part
            {
                if(target>=nums[low] && target<nums[mid])
                {
                    high = mid-1;
                }
                else low = mid+1;
            }
            else//right part
            {
                if(target<=nums[high] && target>nums[mid] )
                {
                    low = mid + 1;
                }
                else
                    high = mid-1;

            }
        }
        return -1;
    }

}
