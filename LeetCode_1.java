import java.util.HashMap;
import java.util.Map;

public class LeetCode_1
{
   public int[] optimized(int[]arr,int target){
       Map<Integer,Integer> nmap = new HashMap<>();
       for(int i= 0;i<arr.length;i++){
           int complement = target-arr[i];
           if(nmap.containsKey(complement)){
               return new int[]{nmap.get(complement),i};
           }
           if(!nmap.containsKey(complement)){
               nmap.put(arr[i],i);
           }
           else{
               throw new IllegalArgumentException("no Match found!!");
           }

       }
       return null;
   }


 
}
