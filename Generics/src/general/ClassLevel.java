package general;

public class ClassLevel {

	 public static void main(String[] args) {
	Main<String> k=new Main<String>();   
	Main<Integer> k2=new Main<>();// to support backward compatability we can neglect<String>
			k.get("1");
			k2.get(2);
			
			Main2<String,Integer> m=new Main2<>(); 
			Main2<Integer,Integer> m2=new Main2<>(); 
			Main<Main2<Integer,Integer>> m3=new Main<>();

			m.get("w");
			m2.get(2);
			m3.get(m2);
		
			A<String> a=s->System.out.println(s);
			a.dummy("w");
			
//			Main ma=k;
//			ma.get(2);
//			Main<String> ma2=ma;
			
		}
	
	
}

//class level generics

 class Main<T>{
	private T t;
	public void get(T t) {
		this.t=t;
		System.out.println(this.t);
	}
	public T get1(T t) {
		return t;
	}
}

 class Main2<T1,T2>{    // we can pass multiple type paramter at class level
		private T1 t;
		public void get(T1 t) {
			this.t=t;
			System.out.println(this.t);
		}
	}
 
 
 // same like class level interface
 interface A<T>{
	 void dummy(T t);
 }