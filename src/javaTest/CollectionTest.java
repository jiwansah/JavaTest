package javaTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class CollectionTest {

	static int i = 0;
	
	public void test() {
		i =0;
	}
	public static void main(String[] args) {
		
			try {
				//Collection<String>;
				Collections at=null;
				ArrayList<Integer> integers = new ArrayList<>();
				integers.add(1);
				integers.add(2);
				integers.add(3);
				Iterator<Integer> itr = integers.iterator();
				while (itr.hasNext()) {
				    Integer a = itr.next();
				    //itr.remove();
				    //integers.remove(a);
				}
				
			} catch(Exception e){
				e.printStackTrace();	
			}
			
			
			Hashtable<String, String> ht = new Hashtable<String, String>();
			ht.put("A","A");
			ht.put("B","B");
			ht.put("C","C");
			
			
			System.out.println(ht.toString());
		
	}

}
