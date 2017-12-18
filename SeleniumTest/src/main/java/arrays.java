import java.util.Arrays;

// How to search an number/character/string in an array
public class arrays {
	public static void main(String args[]) { 
		
		
		Integer[] input = new Integer[]{1, 2, 3, 4, 5};
		System.out.printf("Does array %s has %s? %b %n", Arrays.toString(input), 5, isExists(input, 5)); 
		System.out.printf("Does array %s contains %s? %b %n", Arrays.toString(input), 5, contains(input, 5));
		System.out.printf("Does array %s has %s? %b %n", Arrays.toString(input), 6, isExists(input, 6));
		System.out.printf("Does Integer array %s contains %s? %b %n", Arrays.toString(input), 6, contains(input, 6)); 
		
	}
	
	public static <T> boolean isExists(final T[] array, final T object) {
		Arrays.binarySearch(array, object);
		return Arrays.asList(array).contains(object);
		
		
	}

	public static <T> boolean contains(final T[] array, final T v) { 
		for (final T e : array) {
			if (e == v || v != null && v.equals(e)) { return true; } 
		
		} return false;
		}

//	Read more: http://www.java67.com/2014/11/how-to-test-if-array-contains-certain-value-in-java.html#ixzz4o2dfEbzZ
	//Read more: http://www.java67.com/2014/11/how-to-test-if-array-contains-certain-value-in-java.html#ixzz4o2dYa9lc
		

}
