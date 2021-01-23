class solution{
	public int[] smallerNumberThanCurrent(int[] nums){
		int[] clone = nums.clone();
		Array.sort(clone);
		// here we created a clone array of the given array and then we sorted it by using Array.sort() function.
		// now we will create a HashMap 
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(clone[0],0);
		for(int i = 0;i<clone.length-1;i++){
			if(clone[i+1] < clone[i]){
				map.put(clone[i+1],i+1);
			}
		}
		int res = new int[nums.length];
		for(int i = 0;i<nums.length-1;i++){
			res[i] = map.get(clone[i]);
		}
		return res;
	}
}
