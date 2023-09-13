package book;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		int input;
		System.out.println("숫자를 하나 입력하세요>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
				
		if(input==0) {
			System.out.println("입력한 숫자는 0입니다");
		} else {		// input != 0 인 경우
			System.out.println("입력한 숫자는 0이 아닙니다");
			System.out.printf("입력한 숫자는 %d입니다", input);
		}
	}

}
