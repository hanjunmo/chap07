package com.example;

import util.Alpha;
import util.VT100;

public class DecoAlphaExample {
	
	static class DecoAlpha extends Alpha {
		
		@Override
		public void show() {
			super.show();
			VT100.cursorMove(getLine()+1, getColumn());
			VT100.reset();
			VT100.print('=');
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		VT100.clearScreen();
		Alpha a = new DecoAlpha();
		
		a.show();
		
		VT100.reset();
	}

}
	
       	
