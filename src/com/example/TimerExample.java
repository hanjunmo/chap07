package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
	
	static class A extends TimerTask {
        @Override
        public void run() {
        	System.out.println("oneshot...");
		}
	}

	public static void main(String[] args) {
        Timer timer = new Timer();
        
        TimerTask t1 =new A();
        A a = (A)t1;
//		 timer.schedule(t1, 5000);
        timer.schedule(t1, 0, 1000);
		 
		 System.out.println("Program End...");
	}

}
