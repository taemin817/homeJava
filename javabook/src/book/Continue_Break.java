package book;

public class Continue_Break {

	public static void main(String[] args) {

		// for문에 Loop1 이라는 이름을 붙임
		System.out.println("break Loop1, j==5일 때 Loop1을 끝냄");
		Loop1: for (int i = 2; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						if (j == 5)
							break Loop1;
						// break;
						// continue Loop1;
						// continue;
						System.out.println(i + "*" + j + "=" + i * j);
					}
					System.out.println();
				}
System.out.println("----------------");
System.out.println("j==5일 때 j가 있는 반복문을 끝냄, i가 있는 반복문은 진행");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					// break Loop1;
					break;
				// continue Loop1;
				// continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		System.out.println("----------------");
System.out.println("j가 5일 때 Loop2를 실행시킴");
		Loop2: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					// break Loop1;
					// break;
					continue Loop2;
				// continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		System.out.println("----------------");
System.out.println("j가 5일 때 다음 코드를 진행함 ");
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					// break Loop1;
					// break;
					// continue Loop2;
					continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}
