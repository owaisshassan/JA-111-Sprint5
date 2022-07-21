package sprint5Day3AssignmentsQues2;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {

	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("three");
		al.add("four");
		
		//for-loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("=================");
		
		
		//enhanced-for-loop (for Each)
		for(String i:al) {
			
				System.out.println(i);
			
		}
	
		System.out.println("=================");
		
		
		//Iterator
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String ele= itr.next();
			System.out.println(ele);
		}
		
		
	}
}
