package generics;

public class GenericPrinter<T> {

	private T material;
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void print() {
		System.out.println("3D : " + material);
	}

	public static void main(String[] args) {
		GenericPrinter<Powder> printer = new GenericPrinter<>();
		printer.setMaterial(new Powder());
		printer.print();		// 3D : Powder [content=powder]
		
		GenericPrinter<Plastic> printer2 = new GenericPrinter<>();
		printer2.setMaterial(new Plastic());
		printer2.print();		// 3D : Plastic [content=plastic]
	}

}
