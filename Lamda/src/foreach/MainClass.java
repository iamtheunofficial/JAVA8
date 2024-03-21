package foreach;

import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,3,4);
		
		
		//for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
		
		//for- in loop
		
		for(int k: list) {
			System.err.println(k);
		}
		System.out.println("--------------");

		
		//for-Each loop  // order not followed and fast execution
		
		list.forEach(p->
		{
			System.out.println(p+"dd");}
		);
		System.out.println("--------------");

		list.forEach(System.out::println);

	}
}
