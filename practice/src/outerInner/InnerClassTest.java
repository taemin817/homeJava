package outerInner;

public class InnerClassTest {

	public static void main(String[] args) {
		OutClass out = new OutClass();
		out.OutMethod();	// OutMethod() {	inclass.inMethod();	}
		
		OutClass.InClass inclass = out.new InClass();
		
		inclass.inMethod();
		}
}
