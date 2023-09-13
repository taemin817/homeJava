package book;

public class EnhancedFor {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		/* for(타입변수이름 : 배열 또는 컬렉션 이름){
				변수 등 출력내용
				}*/
		for(int tmp : arr) {
			System.out.printf("%d ", tmp);
			sum+=tmp;
		}
		// 원하는 만큼 반복할 순 없고 배열 전체를 출력
		System.out.println();
		System.out.println("sum="+sum);
	}

}
