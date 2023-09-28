package lamda;
@FunctionalInterface
interface MyFunction3 {
	void myMethod();
}

class Outer {
	int val = 10;	// Outer.this.val
	
	class Inner {
		int val = 20;	// this.val
		
		void method(int i) {	// void method(fianl int i) {
			// 람다식 내에서 참조하는지역변수는 final이 붙지 않아도 상수로 간주
			
			int val = 30;	// final int val = 30;
			// i = 10; //	에러. 상수의 값을 변경할 수 없음
			MyFunction3 f = () -> {
		// MyFunction3 f = (i) -> {		// 에러. 외부 지역변수와 같은 이름의 람다식 매개변수를 미허용
				System.out.println("i : " + i);		// 100
				System.out.println("val : " + val);		// 30
				System.out.println("this.val : " + ++this.val);		// 21
				System.out.println("Outer.this.val : " + ++Outer.this.val);		// 11
			};
			f.myMethod();
		}
	}	//	Inner의 끝
}	// Outer의 끝
public class LamdaEx3 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
		
	}
}
