/*Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.*/
class Solution{
     public boolean containsDuplicate(int[] nums){
          HashMap<Integer,Integer> map = new HashMap<>();
          for(int i : nums){
               if(map.containsKey(i)){
                    return true;
               }else
                    map.put(c,1);
          }
          return false;
     }
}
