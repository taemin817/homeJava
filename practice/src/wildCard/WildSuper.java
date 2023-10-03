package wildCard;

import java.util.ArrayList;
import java.util.List;

public class WildSuper {

	// Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
	public static void printData(List<? super Man> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {

		// Person
		List<Person> listP = new ArrayList<Person>();	// List는 ArrayList의 상위 클래스
		listP.add(new Person("이사람"));
		listP.add(new Person("저사람"));
		printData(listP);
		
		// Man
		List<Man> listM = new ArrayList<Man>();
		listM.add(new Man("이재용"));
		listM.add(new Man("팀쿡"));
		printData(listM);
		
		// Woman
		List<Woman> listW = new ArrayList<Woman>();
		listW.add(new Woman("아이유"));
		listW.add(new Woman("김연아"));
		// printData(listW); Man클래스의 상위 클래스가 아니기 때문에 메서드 호출 불가
	}
	

}
