package stream;

public class User {
	String id;
	String nm;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nm=" + nm + "]";
	}
	public User(String id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	public User(String id) {
		super();
		this.id = id;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
