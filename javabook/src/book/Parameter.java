package book;

class Data {int x;}
public class Parameter {
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main(): x = " + d.x);
		System.out.println("-------------------------");
		change1(d.x);
		System.out.println("after change1(d.x)");
		System.out.println("main() : x = " + d.x);
		System.out.println("-------------------------");
		change2(d);
		System.out.println("after change2(d)");
		System.out.println("main() : x = " + d.x);
	}
	static void change1(int x) {
		x = 1000;
		System.out.println("change1() : x = " + x);
	}
	static void change2(Data d) {
		d.x = 1000;
		System.out.println("change2() : x = " + d.x);
	}
}
