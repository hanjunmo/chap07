package com.example;

public class InherianceExample2 {
	static class Parent {
		int line;
		int column;

		public Parent() {
			line = 10;
			column = 20;
		}
		
		void show() {
			System.out.printf("[%d, %d]\n", line, column);
		}
	}

	static class Child extends Parent {

	}

	public static void main(String[] atgs) {
		Child c = new Child();
		System.out.println(c.line);
		System.out.println(c.column);

		c.show();
	}

}