package september05;

/**
 * Given an unsorted array of length N
 * find the largest gap between any two elements of the array
 * 
 * @author Devin Abreu
 */
public class LargestGapInArray {
	public static void main(String[] args) {
		int[] arrayOne = {3, 10, 6, 7}; // Expected Output = 7
		int[] arrayTwo = {-3, -1, 6, 7, 0}; // Expected Output = 10
		
		System.out.println("The largest gap in arrayOne is: " + largestGap(arrayOne));
		System.out.println("The largest gap in arrayTwo is: " + largestGap(arrayTwo));
	}
	
	public static int largestGap(int[] arr) {
		int result = 0;
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) { // O(n) time complexity
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		result = Math.abs(min - max);
		
		return result;
	}

}
