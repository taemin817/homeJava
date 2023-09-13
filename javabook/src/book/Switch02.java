package book;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {

		System.out.println("가위-1, 바위-2, 보-3 중 하나를 입력하세요>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
							// 0.0이상 3.0미만을 반환하기 때문에 정수로 바꿔주고 사용자의 입력과 맞추기 위해 1을 더해줌
		int com = (int)Math.random()*3+1;
		
		System.out.println("사용자 : "+user);
		System.out.println("컴퓨터 : "+com);
				// 플레이어의 수를 빼서 나온 결과를 가지고 판단
		switch (user-com) {
		case 2: case -1:
			System.out.println("사용자의 패배");
			break;
		case 1: case -2:
			System.out.println("사용자의 승리");
			break;
		case 0:
			System.out.println("무승부");
			break;
		}
	}

}
