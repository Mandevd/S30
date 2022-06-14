//
//
//Given an sorted array, find the first and last position of a given element.
//
//Your algorithm's runtime complexity must be O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//Example 1:
//
//Input: nums = [5,7,8,9,9,10], target = 9
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 4
//Output: [-1,-1]

public class Binary_Search1 {

   public int first(int[]nums, int low, int high, int target){
       while(low<=high){
           int mid = low+(high-low)/2;
           if(nums[mid] == target) {
               if (mid == low || nums[mid - 1] < nums[mid]) return mid;
               else {
                   high = mid - 1;
               }
           }
           else if(nums[mid]>target) {
                   high = mid - 1;
               }
           else low = mid+1;



       }
       return -1;
   }
    public int second(int[]nums, int low, int high, int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == target) {
                if (mid == high || nums[mid + 1] > target) return mid;
                else {
                    low = mid + 1;
                }
            }
            else if(nums[mid]>target) {
                high = mid - 1;
            }
            else low = mid+1;


        }
        return -1;
    }
    public int[] searchRange(int[]nums, int target){
       int left = first(nums,0,nums.length-1,target);
       int right = second(nums,0,nums.length-1,target);
       return new int[]{left,right};
    }
}
