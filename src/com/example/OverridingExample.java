package com.example;

import java.util.TimerTask;

public class OverridingExample {
    static class A {
    	void sohw() {
    		System.out.println("A.show()...");
    	}

		void show() {
			// TODO Auto-generated method stub
			
		}
    }
    
	static class B extends A {
		
		@Override
		void show() {
			System.out.println("B.show()...");
		}
		
	}
	
	static class C extends TimerTask {
		
		@Override
		public void run() {
			
		}
		
		public void xxx() {
			
		}
	}
	
	public static void main(String[] args) {
		String str = "Hello";
       B b = new B ();
       A a = b;
       
       a.sohw();
       
	}

}
