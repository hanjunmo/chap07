package com.example;

import util.Alpha;
import util.VT100;

public class BlinkExample {

	static class Blink extends Alpha {
		
		int speed;
		public Blink() {
			this(100);
	}
		public Blink(int speed) {
//			super();
			this.speed = speed;
		}
		
		void blink() throws InterruptedException {
			show();
			Thread.sleep(speed);
			hide();
			Thread.sleep(speed);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
			VT100.clearScreen();
			
			Blink b =new Blink();
			for (int i=0; i<=0; i++)
			   b.blink();
			
			VT100.reset();
			System.out.println("Program End...");
      }

}
		
