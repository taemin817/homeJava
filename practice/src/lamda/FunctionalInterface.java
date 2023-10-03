package lamda;

import java.util.function.Predicate;

public class FunctionalInterface {

	public static void main(String[] args) {

		Predicate<String> isEmptyStr = s->s.length()==0;
		String s = "abcd";
	//  String s = "";	
		if(isEmptyStr.test(s))
			System.out.println("비어있는 문자열");
		else {
			System.out.println(s);
		}
	}

}
