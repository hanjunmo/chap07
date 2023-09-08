package com.example;

import java.util.Timer;
import java.util.TimerTask;

import com.example.AlphaCrossExample3.Cross;
import com.example.AlphaMoveExample3.AlphaMove;
import com.example.AlphaMoveExample3.AlphaMove.Direction;

import util.Alpha;
import util.VT100;

public class AlphaMoveExample2 {
	public static final int UP = 0;

	static class Cross extends Alpha {
		
		final Direction direction;
		
		public Cross() {
			line = 10;
			column = 20;
			direction = Direction.values()[(int)(Math.random()*4)];
		}
		
		void left() {
			hide();
			column--;
			show();
		}
		void right() {
			hide();
			line++;
			show();
		}
		void up() {
			hide();
			line--;
			show();
		}
		void down() {
			hide();
			line++;
			show();
	}
		void move() {
			switch (direction) {
			case UP:
			   up();
			   break;
			case DOWN:
			   down();
			   break;
			case LEFT:
			   left();
			case RIGHT:
				right();
		  default:
				break;
		}
			
	enum Direction {
		UP,DOWN, LEFT, RIGHT
	
			
					}
				}
			}
			
			class MoveTimerTask extends TimerTask {
				static int totalCount=0;
				
			
              AlphaMove alphaMove1 = new AlphaMove();
				
				Direction direction = Direction.RIGHT;


				int count;
				
				public MoveTimerTask() {
					totalCount++;
				
				}

				@Override
				public void run() {
					
				}
				
		static class CrossTask extends TimerTask {
			Cross c = new Cross();
			
			@Override
			public void run() {
				Alpha alpha;
				alpha.move();
				
				if (alpha.getLine()==1 || alpha.getLine()==20 ||
				    Alpha.getColumn()==1 || Alpha.getColumn()==40) {
					
				}

			}
			
		}
				
		static Timer timer = new Timer();
		
				public static void main(String[] args) throws InterruptedException {
					VT100.clearScreen();
					
					timer.schedule(new CrossTask(), 0, 100);

					
					
					VT100.reset();
				}
		}
				
