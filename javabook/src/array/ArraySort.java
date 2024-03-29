package array;

public class ArraySort {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		
		// numArr에 0~9 사이 임의 수를 저장
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10) );
		}System.out.println();
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false;	// 자리바꿈이 발생했는지 체크하는 코드
			
			for (int j = 0; j < numArr.length-1-i; j++) {
				if(numArr[j]> numArr[j+1] ) {
					int temp = numArr[i];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;	// 자리바꿈 발생
				}
			}	// end j
			if (!changed) break;	// 자리바꿈이 발생하지 않으면 반복문 탈출
			for (int k = 0; k < numArr.length; k++) {
				System.out.print(numArr[k]);
			}	// end k
			System.out.println();
		}	// end i
	}

}
