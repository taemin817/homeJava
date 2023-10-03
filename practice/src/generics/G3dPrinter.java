package generics;

// 제네릭 클래스 만들기
public class G3dPrinter<T> {

	private T material;
	// 이 클래스 안에서만 접근할 수 있도록 private으로 설정
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void print() {
		System.out.println("3d print " + material);
	}
}
