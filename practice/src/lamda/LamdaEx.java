package lamda;

class MyInterfaceImp implements MyInterface{
	@Override
	public void specMethod() {
		System.out.println("기능을 구현함");
	}
}

public class LamdaEx {

	public static void main(String[] args) {
		MyInterfaceImp mi = new MyInterfaceImp();	// 인터페이스의 상속을 통해 override
		mi.specMethod();	// 기능을 구현함
		
		// 익명클래스를 사용하는 방식
		MyInterface mi2 = new MyInterface() {
			@Override
			public void specMethod() {
				System.out.println("기능을 구현함");
			}
		};
		mi2.specMethod();	// 기능을 구현함
		
		MyInterface mi3 = () -> System.out.println("기능을 구현함");
		mi3.specMethod();
	}

}
