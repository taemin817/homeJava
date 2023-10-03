package lamda;

public class LamdaAdd {

	public static void main(String[] args) {
		Add instance = (a, b) -> a+b;
		
		Add instance2 = new Add() {
			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};
		
		int result = instance.add(10, 5);
		int result2 = instance2.add(3, 8);
		
		System.out.println(result);
		System.out.println(result2);
	}

}
