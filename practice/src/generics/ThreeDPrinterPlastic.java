package generics;

public class ThreeDPrinterPlastic {

	private Plastic material;
	// 이 클래스 안에서만 접근할 수 있도록 private으로 설정
	// 타입이 Plastic인 변수 material( Plastic 클래스에서 Material을 상속받음 )
	
	public void setMaterial(Plastic material) {
		this.material = material;
	}

	public Plastic getMaterial() {
		return material;
	}

	public void print() {
		System.out.println("3D print use : " + material);
	}

}
