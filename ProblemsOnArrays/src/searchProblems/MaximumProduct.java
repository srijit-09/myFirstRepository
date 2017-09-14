package searchProblems;
//TODO
public class MaximumProduct {

	
	public void printMaximumProduct (int[] numbers ) {
		
	/*int [] maxandminnumber=	MaximumMinimumArrayDemo.largestAndSmallest(testArray);
	
int	itr1smallest = maxandminnumber[0];
int	itr1largest = maxandminnumber[1];
*/
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
		}
		
		

	
		
		
		
	}
	
	
	
}
