package book;

public class ArrayCopy02 {
	public static void main(String[] arg) {

		char[] abc = { 'a', 'b', 'c', 'd' };
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(abc);
		System.out.println(num);

		// 배열 abc와 num을 더해 result라는 배열로 만듦
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		System.out.println("-----------------------");
		
		// 배열 abc를 num의 첫 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		// 
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
