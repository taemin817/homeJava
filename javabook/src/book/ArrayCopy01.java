package book;

public class ArrayCopy01 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		// 1. for문을 이용 : 배열의 길이를 넉넉하게 생성 후 삽입
		System.out.println("변경 전");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"] : " + arr[i] + ", ");
		}
		// arr배열보다 길이가 2배인 tmp배열 생성
		System.out.println();
		int[] tmp = new int[arr.length*2];
		// tmp배열에 arr배열을 복사
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;	// tmp를 arr로 바꿔줌
		
		System.out.println("배열을 새로 만들고 복사");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : "+ arr[i] + ", ");
		}
		
		/*	해당 내용을 System.arraycopy로 바꿔주어 배열 복사
				for (int i = 0; i < arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;	
		*/
		System.out.println();
		System.out.println("arraycopy 사용");
		// arr의 0번째에서 tmp의 0번째로 arr의 길이만큼 복사
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		arr = tmp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : "+ arr[i] + ", ");
		}
	}

	
}
