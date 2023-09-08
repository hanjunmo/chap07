package com.example;

public class SuperExample {
    static class A {
    	public A() {
    		System.out.println("A()...");
    	}
    }
    
    static class B extends A {
    	public B() {
//    		super();
    		System.out.println("B()...");
    	}
    }
    
    static class C {
    	public C(int speed) {
    		
    	}
    }
    
    static class D extends C {
    	public D() {
   		   super(100);
		}
    	public D(int line) {
    		super(200);
    		
    	}
    	
    	public D(int line, int column) {
    		super(300);
    	}
    	
    }
    
    
	public static void main(String[] args) {
        B b = new B();
        
	}

}
