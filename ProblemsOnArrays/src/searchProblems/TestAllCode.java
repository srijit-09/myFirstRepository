package searchProblems;

public class TestAllCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumMinimumArrayDemo maxmindemo = new MaximumMinimumArrayDemo();
		
		
		maxmindemo.largestAndSmallest(new int[]{-20, 34, 21, -87, 92, Integer.MAX_VALUE});
		maxmindemo.largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2}); 
		maxmindemo.largestAndSmallest(new int[]{Integer.MAX_VALUE, 40, Integer.MAX_VALUE}); 
		maxmindemo.largestAndSmallest(new int[]{1, -1, 0});

	

}
}