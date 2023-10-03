package outerInner;

public class OuterClass2 {
	int outNum = 100;
	
	// 메서드 내에서 내부클래스, 익명클래스
	public Runnable getRunnable(int i )	{
		int localNum = 20;
		// 익명클래스
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
					System.out.println(outNum);
					System.out.println(localNum);
					System.out.println(i);
				}
		};
		return runnable;
	}
}
