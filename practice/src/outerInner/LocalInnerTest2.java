package outerInner;

public class LocalInnerTest2 {

	public static void main(String[] args) {

		OuterClass2 outer = new OuterClass2();
		Runnable runnable = outer.getRunnable(10);
				runnable.run();
				// outNum = 100;
				// localNum = 20;
				// i = 10;
	}

}
