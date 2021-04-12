package javaTest;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	static String msg="  Msg";	
	final String finalString ;
	private boolean flag;
	private String data = "Jiwan";
	
	Test2() {
		this.finalString = "";
		this.data = "data";
		System.out.println("Constructor ");
	}
	 
	public void display() {
		System.out.println(" Data: "+ data);
		msg =" Msg for Display";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 tt= new Test2();
		Test2 tt2= new Test2();
		
		final String s = "";
		
		tt.display();
		if(tt.flag) {
			
		}
		
		if (tt instanceof Test2) {
			
		}
		System.out.println("Msg");
		Test2.InnerClass I = tt. new InnerClass();
		I.display();
		
	}

	public class InnerClass { 
        public void display() 
        { 
            System.out.println( 
                "Message from non-static nested class: "
                + msg); 
            Test3 t3_2 = new Test3();
        } 
    } 
}
