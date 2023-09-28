package acorn;

public class Student implements MyComparable{
	int kor;
	int eng;
	
	public Student(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return (this.kor-tmp.kor)>0 ? 1: 0;
		}
		return 0;
	}
	public String toString() {
		return kor + " : " + eng + "";
	}
}