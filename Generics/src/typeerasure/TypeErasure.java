package typeerasure;

import java.util.List;

class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
 
 // after type erasure
 
// class Node {
//
//	    public Object data;
//
//	    public Node(Object data) { this.data = data; }
//
//	    public void setData(Object data) {
//	        System.out.println("Node.setData");
//	        this.data = data;
//	    }
//	}

 
 class A2<T extends Number>
 {
	 
	 private T key;
	 
	 public  void get(List<T> list) {}
 }
 
// after type erasure
 
// class A2
// {
//	 
//	 private Number key;
//	 
//	 public  void get(List list) {}
// }

 class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        
        super.setData(data);
    }
    
}
 
 
// after type erasure
 
// class MyNode extends Node {
//	    public MyNode(Integer data) { super(data); }
//
 
 
 
// ** Note: to maintain polymorphism compiler genrate this method is called bridge method
 
// public void setData(Object data) {
// setDate(data)
// }
 
//	    public void setData(Integer data) {
//	        System.out.println("MyNode.setData");
//	        super.setData(data);
//	    }
//	}
 
 public class TypeErasure {
	 
	 
public static void main(String[] args) {
	
	System.out.println("type erasure is process during compilation after type checking ");
	System.out.println("it will remove all the generics this process is type erasure like erase the type  ");
	System.out.println("after type erasure the type will be replaced by upper bound if upper bound mentioned if it is unbounded or lowerbound then thr type will be replaced by Object type");
	MyNode mn = new MyNode(5);
	Node n = mn;            // A raw type - compiler throws an unchecked warning
	n.setData("Hello");     // Causes a ClassCastException to be thrown.  bcz expecting interger passing string
	Integer x = mn.data;
	


}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
