package lamda;
@FunctionalInterface
interface MyFunction1	{
	void run();	// public abstract void run();
}

public class LamdaEx1 {
	static void execute (MyFunction1 f)	{	// 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction1 getMyFunction()		{	// 반환타입이 MyFunction인 메서드
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction1 f1 = ()->System.out.println("f1.run()");
		
		MyFunction1 f2 = new MyFunction1() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		MyFunction1 f3 = getMyFunction();
		
		f1.run();	// 출력 : f1.run()
		f2.run();	// 출력 : f2.run()
		f3.run();	// 출력 : f3.run()
		
		execute(f1);	// 출력 : f1.run()
		execute( () -> System.out.println("run()"));	// 출력 : run()
	}

}
