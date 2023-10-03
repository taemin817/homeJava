package outerInner;

public class OutClass {
	private int num = 100;
	private InClass inclass;
	
	public OutClass() {
		inclass = new InClass();
	}
	
	public void OutMethod()	{
		inclass.inMethod();
	}
	
	class InClass	{
		int inNum = 200;
		
		void inMethod() {
			System.out.println(num);
			System.out.println(inNum);
		}
	}
}
