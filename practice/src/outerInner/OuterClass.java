package outerInner;

public class OuterClass {
	int outNum = 100;
	// 메서드 내에서 내부클래스, 지역내부클래스
	public Runnable getRunnable(int i)	{
		int localNum = 20;
		
		class MyRunnable implements Runnable{
			@Override
			public void run() {
				System.out.println(outNum);
				System.out.println(localNum);
				System.out.println(i);
			}
		}
		return new MyRunnable();
	}
}
