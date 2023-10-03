package stream;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Optional<User> user = searchUserOptional("ㅎㅎ");
		System.out.println(user.orElse(new User()).getId());
								// orElse : If a value is present, returns the value, otherwise returns other.
		
//		User user2 = searchUser("gy");
//		System.out.println(user2.getId());		// nullPointException
	}
	
	private static Optional<User> searchUserOptional(String id){
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("hong", "h11"));
		users.add(new User("kim", "h11"));
		users.add(new User("lee", "h11"));
		return users.stream().filter(user->user.getId().equals(id)).findFirst();
		// 일치하는 게 없으면 Optional.empty()를 반환
		// Optional 클래스를 사용하는 이점은 검색 결과가 없는 경우 null 대신 명시적으로 처리할 수 있음
		// 이로 인해 NullPointerException을 방지하고 코드 안정성을 향상
	}

	private static User searchUser(String id) {
		User user = null;
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("hong", "t11"));
		users.add(new User("kim", "t11"));
		users.add(new User("lee", "t11"));
		
		for(User u : users) {
			if(u.getId().equals(id)) {
				user = u;
			}
		} return user;	// 못찾으면 null 반환
	}
}
