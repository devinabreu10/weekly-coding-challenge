package september05;

/**
 * Given an array arr[] of integers
 * find the maximum sum sub-array among all the possible sub-arrays
 * 
 * @author Devin Abreu
 */
public class MaximumSumSubArray {
	public static void main(String[] args) {
		int[] arrayOne = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Expected Ouput = 6 --> {4, -1, 2, 1} is the required sub-array
		int[] arrayTwo = {2, 2, -2}; // Expected Output = 4
		
		System.out.println("The maximum sum sub-array for arrayOne is: " + maximumSum(arrayOne));
		System.out.println("The maximum sum sub-array for arrayTwo is: " + maximumSum(arrayTwo));
	}
	
	public static int maximumSum(int[] arr) {
		int result = 0;
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) { // O(n) time complexity
			max = max + arr[i];
			if(result < max) {
				result = max;
			}
			if(max < 0) {
				max = 0;
			}
		}
		return result;
	}

}
