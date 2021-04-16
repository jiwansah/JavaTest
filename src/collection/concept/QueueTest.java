package collection.concept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		System.out.println("====================Queue - LinkedList======================");
		Queue<String> q = new LinkedList<String>();
		q.add("a"); q.add("e"); q.add("c"); q.add("d"); q.add("b"); 
		System.out.println(q);
		System.out.println( q.peek() );
		System.out.println( q.poll() );
		System.out.println(q);
		
		System.out.println("====================Queue - PriorityQueue======================");
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("a"); pq.add("e"); pq.add("c"); pq.add("d"); pq.add("b"); 
		System.out.println(pq);
		System.out.println( pq.peek() );
		System.out.println( pq.poll() );
		System.out.println(pq);
		
		System.out.println("====================Queue - PriorityQueue Object======================");
		Queue<Person> pqo = new PriorityQueue<Person>();
		pqo.add(new Person("Test-1", 1)); pqo.add(new Person("Test-2", 2)); 
		pqo.add(new Person("Test-3", 3)); pqo.add(new Person("Test-4", 4)); 
		pqo.add(new Person("Test-5", 1)); 
		System.out.println(pqo);
		System.out.println( pqo.peek() );
		System.out.println("----------");
		while(!pqo.isEmpty()) 
		{
			System.out.println( pqo.poll() );
		}
		System.out.println("------------");
		System.out.println(pqo);
	}

	private static class Person implements Comparable<Person> {

		public String name;
		public int id;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		Person(String name, int id){
			this.name = name;
			this.id = id;
		}
		
		
		@Override
		public String toString() {
			return id+" : "+name;
		}
		@Override
		public int hashCode() {
			return (this.id + 2) * this.name.length();
		}
		@Override
		public boolean equals(Object obj) {
			//return this.name.equals( ((Person)obj).name) && this.id == ((Person)obj).id;
			return this.id == ((Person)obj).id;
		}
		@Override
		public int compareTo(Person o) {
			return this.id - o.id;
		}
	}
}
