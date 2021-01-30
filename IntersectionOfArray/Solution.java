class Solution{
   public int[] intersection(int[] nums1, int[] nums2){
      //we have to find the intersection of two arrays in this queston
      // In simplified manner we have to find the elements of the array which
      // present on both the array.
      Set<Integer> set1 = new HashSet<>();
      for(int i : nums1){
        set1.add(i);
      }
      Set<Integer> set2 = new HashSet<>();
      for(int i : nums2){
        if(set1.contains(i)){
          set2.add(i);
        }
      }
      int[] res = new int[set.size()];
      int n = 0;
      for(int i : set2){
        res[n] = i;
        n++;
      }
      return res;
   }
}
