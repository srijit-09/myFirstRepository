package searchProblems;

import java.util.Arrays;

public class SearchGeneric {

	public static <T> boolean isExists(final T[] array, final T object) {
		return Arrays.asList(array).contains(object);

	}

	public static <T> boolean contains(final T[] array, final T v) {
		for (final T e : array) {
			if (e == v || v != null && v.equals(e)) {
				return true;
			}
		}
		return false;
	}

}
