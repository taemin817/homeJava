package lamda;

class Cal {
	public static void calAdd(Add a) {
		int result = a.add(8, 10);
		System.out.println(result);
	}
}

public class LamdaAddTest{
	public static void main(String[] args) {
		Cal.calAdd((a,b)->a+b);
	}
}
