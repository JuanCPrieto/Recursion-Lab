
public class ArraySum 

{
	
	public int sumOfArray(Integer[] a, int index) {
	    // Base case: if the index is less than 0, return 0 (no more elements to sum)
	    if (index < 0) {
	        return 0;
	    }
	    
	    // Recursive case: add the current element to the sum of the rest of the array
	    return a[index] + sumOfArray(a, index - 1);
	}

}
