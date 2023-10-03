package lamda;

import java.util.Scanner;
/*
interface Runnable{
		void run();			// 매개변수도 반환값도 없다
	}
*/
public class RunnableTest {

	public static void main(String[] args) {
		// 1.
		Runnable r = () -> System.out.println("람다식!");
		r.run();
		
		// 2. 익명함수로
		Runnable r2 =  new Runnable() {
			@Override
			public void run() {
				System.out.println("인터페이스를 익명으로 구현");
			}
		};
		r2.run();
		
		// 3. 이름있는 형식으로
		class B implements Runnable{
			@Override
			public void run() {
				System.out.println("인터페이스를 이름있는 클래스로 구현");				
			}
		}
		B bb = new B();
		bb.run();
		
		// 람다식으로 실행하고싶은 코드
		Runnable insertnm = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요>");
			String name = sc.nextLine();
			System.out.println("너의 이름은 : " + name + "!");
		};
		insertnm.run();
	}

}
