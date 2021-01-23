//Question - Sum of all Odd length subarrays 
class Solution{
	public int sumOddLengthSubarrays(int[] arr){
		int totalSum = 0;
		for(int windowSize = 1;windowSize<=arr.length;windowSize+=2){
			int windowSum = 0;
			for(int i = 0;i<windowSize;i++){
				windowSum += arr[i];
			}
			totalSum += windowSum;
			for(int i =1;i+windowSize<=arr.length;i++){
				windowSum = windowSum - arr[i-1] + arr[windowSize + i -1];
				totalSum += windowSum;
			}
		}
		return totalSum;
	}
}
/*This question is done by using sliding window technique - 
		1. In the first loop we used windowSize as the size of the window and initialized it as 1 and icremented by 2 
		   i.e. windowSize = 1,3,5,7------
		2. Inside the first loop we initialized a int variable windowSum and used a for loop to get the some of array 
		   element who's indexes value are same as windowSize. Therefore the value of windowSum is -
		   	arr[1] on first iteration 
		   	arr[1]+arr[2]+arr[3] on second iteration
		   	and so on.
		3. We created a variable in the start of the method sumOddLengthSubarrays named totalSum and inside our loop we 
		   assigned it the value of windowSum after completion of first nested loop. 
		4. Now in the Second nested for loop the check condition to enter inside the loop is (i+windowSum)<=arr.length.
		5. Inside the second nested loop the value of windowSum is incrementing as - 
			windowSum += - arr[i-1] + arr[windowSum + i -1]
			 
