package general;

import java.util.List;

interface x{
	void run();
}
class Shape<T> {
	
	
	public static<U extends  Shape>  void get(U t) {
		System.out.println(t);
	}
	
	public <U extends Shape,x>  void a(U u) {
	u.a();
	
	
		System.out.println();
	}
	
	public int a() {
		return 9;
	}
	public static<T extends Number> void x(List<T> t) {
		
	}
	
}


class Circle extends Shape{
	
//	class then interface
	 <T extends Shape&x> void color(T u) {
		 
//		 i can use methods of those classes and interface if those have some kind of relation or else we can acces only first one
//		 u.a();
//		 u.run();
		System.out.println("blue");
	}
}

public class BounderType {
	public static void main(String[] args) {
		
		System.out.println("adding restriction to generics  in both method and class level");
		
		System.out.println("if i use extend means i can use the method of that extendend clases or interfaces ");
		
		System.out.println("while specifying the vounds we should first specify class then interface");
		System.out.println("we can't bound to more than one class bcz multiple inheritence not posssible");
		Shape.get(new Circle());
//		Shape.get("222"); // error
		
		Shape.x(null);
		
	}
}
	
	


