import java.io.CharArrayReader;

/**
 Given an integer array sorted in ascending order, write a function to searchtargetinnums. Iftargetexists, then return its index, otherwise return-1.However, the array size is unknown to you. You may only access the array using anArrayReader interface, where ArrayReader.get(k)returns the element of the array at indexk (0-indexed).

 You may assume all integers in the array are less than 10000, and if you access the array out of bounds,ArrayReader.getwill return2147483647.

 Example 1:

 Input: array = [-1,0,3,5,9,12], target = 9
 Output: 4
 Explanation: 9 exists in nums and its index is 4

 */
public class InfiniteBinarySearch {

    public int search(CharArrayReader reader,int target) {

        int high =1;
        int low =0;
        while(reader.get(high)!= Integer.MAX_VALUE &&  target>=reader.get(high))
        {
            low =
            high =high*2;
        }
        return binarySearch(reader, target,low,high)
    }
        private int binarySearch(CharArrayReader reader,int target,int low,int high){
            while(low<=high){
                int mid = low+(high-low)/2;
                if(reader.get(mid) == target){
                    return mid;
                }
                else if(reader.get(mid)>= target){
                    high = mid -1;
                }
                else
                    low = mid+1;
            }
            return -1
        }


}
