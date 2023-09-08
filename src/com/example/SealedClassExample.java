package com.example;

public class SealedClassExample {

	static sealed class Person permits Employee, Manger {
		
	}
	
	static non-sealed class Employee extends Person {
		
	}
	
	static non-sealed class Manger extends Person {
		
	}
	
	static /*non-sealed*/ class Student /* extends Person */ {
		
	}
	
	public static void main(String[] args) {

	}

}
