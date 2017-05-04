package at.fhj.sorting;

public class Sort {

	/**
	 * sort an array with quicksort algorithm
	 *
	 * @param a ... whole array of values to sort
	 * @param l ... left boundary; where to start sorting
	 * @param r ... right boundary; where to end sorting
	 */
	public static <T extends ICompare<T>> void quicksort(T[] a, int l, int r) {
		// Begin Implementation

		if (a.length > 0) {

			int left = l;
			int right = r;

			T pivot = a[l + (r - l) / 2];

			while (left <= right) {
				while (a[left].lesserEqual(pivot) && !(a[left].greaterEqual(pivot))) {
					left++;
				}
				while (a[right].greaterEqual(pivot) && !(a[right].lesserEqual(pivot)) ) {
					right--;
				}
				if (left <= right) {
					swapper(a, left, right);
					left++;
					right--;
				}
			}
			if (l < right) {
				quicksort(a, l, right);
			}
			if (left < r) {
				quicksort(a, left, r);
			}
		}
	}

	/**
	 * sort an array with bubblesort algorithm
	 *
	 * @param a ... whole array of values to sort
	 */
	public static <T extends ICompare<T>> void bubblesort(T[] a) {
		// Begin Implementation
		T temp;
		int changes;
		do {
			changes = 0;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i].lesserEqual(a[i + 1])) {
					continue;
				}
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				changes = 1;
			}
		} while (changes > 0);
		// End Implementation
	}

	// add your private auxiliary methods here
	public static <T extends ICompare<T>> void swapper(T[] a, int i, int j) {
		// Begin Implementation
		T swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		// End Implementation
	}
}