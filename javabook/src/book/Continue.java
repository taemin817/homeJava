package book;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)을 선택하세요(0 : 종료)");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (!(1<=menu && menu<=3)) {
				System.out.println("메뉴를 잘못 선택했습니다");
				continue;
			}
					System.out.println("선택한 메뉴는 "+menu+"번 입니다");
		}
	}

}
