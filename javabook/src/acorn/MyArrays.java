package acorn;

public class MyArrays {

	public static void sort(Object[] arr, MyComparator c) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(c.compare(arr[i], arr[j])>0) {
					Object tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public static void sort(Object[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if( arr[i] instanceof MyComparable) {
					if( ((MyComparable) arr[i]).compareTo(arr[j])>0) {
						Object tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
	}
	
}
