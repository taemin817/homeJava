package generics;

public class GenericPrinterMaterial<T extends Material> {
	private T material;
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public void print()	{
		System.out.println("3D print : " + material);
	}
	public static void main(String[] args) {
		GenericPrinterMaterial<Powder> printer = new GenericPrinterMaterial<>();
		printer.setMaterial(new Powder());	// Powder [content=powder]
		printer.print();	// 3D print : Powder [content=powder]
		
		GenericPrinterMaterial<Plastic> printer2 = new GenericPrinterMaterial<>();
		printer2.setMaterial(new Plastic());	// Plastic [content=plastic]
		printer2.print();	// 3D print : Plastic [content=plastic]
		
		// GenericPrinterMaterial<Water> printer3 = new GenericPrinterMaterial<>();
									// Water는 Material을 상속하지 않아서 성립하지않음
	}

}
