package outerInner;

public class LocalInnerTest {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		Runnable runnable = outer.getRunnable(10);
		// outNum = 100;
		// localNum = 20;
		// i = 10;
		runnable.run();
	}
}
