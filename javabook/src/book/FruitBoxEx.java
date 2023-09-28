package book;

import java.util.ArrayList;

interface Eatable{}
class Fruit implements Eatable{
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit{ public String toString() { return "Apple"; }}
class Grape extends Fruit{ public String toString() { return "Grape"; }}
class Tooy					 { public String toString() { return "Toy"; 	 }}

class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
}
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

public class FruitBoxEx {
	public static void main(String[] args) {

		FruitBox<Fruit> fruitbox = new FruitBox<>();
		FruitBox<Apple> applebox = new FruitBox<>();
		FruitBox<Grape> grapebox = new FruitBox<>();
	// FruitBox<Grape> grape = new FruitBox<Apple>()  => 불가능
		
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		applebox.add(new Apple());
		grapebox.add(new Grape());
	// grapebox.add(new Apple()); => 불가능
		
		System.out.println("fruitbox : " + fruitbox);
		System.out.println("applebox : " + applebox);
		System.out.println("grapebox : " + grapebox);
	}

}
