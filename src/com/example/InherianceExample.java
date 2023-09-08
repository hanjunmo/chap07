package com.example;

public class InherianceExample {
	int num;
	static class Parent {
		
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
	}
	
	public static void main3(String[] args) {
		InherianceExample x = new InherianceExample();
		x.num = 100;
//		Parent p = x.new Parent(); (X)
		
	}

	public static void main2(String[] args) {
//		num = 100; (X)
//		Parent p= new Parent(); (X)
	}

}
