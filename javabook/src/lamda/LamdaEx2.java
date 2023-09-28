package lamda;

@FunctionalInterface
interface MyFunction2	{
	void myMethod();
}
public class LamdaEx2 {

	public static void main(String[] args) {
		MyFunction2 f = () -> {};	//	MyFunction f = (MyFunction) ( ()->{} );
		Object o = (MyFunction2) ( () -> {} );	// Object타입으로 형변환이 생략됨
		String str = ((Object)(MyFunction2)( ()->{})).toString();
		
		// 컴파일러가 람다식의 타입을 어떤 형식으로 만들어내는지 알아보자
		// 일반적인 익명객체라면 객체의 타입이 '외부클래스이름$번호' 같은 형식
		// 람다식의 타입은 '외부클래스이름$$Lamda$$번호'와 같은 형식
		System.out.println(f);
		System.out.println(o);
		System.out.println(str);
		
		// System.out.println( ()->{} );	//	에러. 람다식은 Object타입으로 형변환 안됨
		System.out.println((MyFunction2) ( () -> {}));
		// System.out.println( (MyFunction(()->{} ).toString();	//	에러
		System.out.println(((Object)(MyFunction2)( ()->{})).toString());

	}

}
