package com.example;

import java.util.Timer;
import java.util.TimerTask;

import com.example.AlphaMoveExample3.AlphaMove;
import com.example.AlphaMoveExample3.AlphaMove.Direction;

import util.Alpha;
import util.VT100;

public class AlphaMoveExample3 {
	static class AlphaMove extends Alpha {
		public AlphaMove() {
			line = 1;
			column = 1;
		}
		
		void right() {
			hide();
			column++;
			show();
		}
		void down() {
			hide();
			line++;
			show();
		}
		void left() {
			hide();
			line++;
			show();
		}
		void up() {
			hide();
			line++;
			show();
	}
	enum Direction {
		UP,DOWN, LEFT, RIGHT
	}
			
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
					switch (direction) {
					case RIGHT:
						break;
						alphaMove.right();
					case DOWN:
						break;
						alphaMove.down();
					case LEFT:
						break;
						alphaMove.left();
					case UP:
						break;
						alphaMove.up();
					default:
						break;
				}
					
					if(alphaMove.getLine()==1 && alphaMove.getColumn()==1) {
						direction = Direction.RIGHT;
					   count++;
					else if (alphaMove.getLine()==1 && alphaMove.getColumn()==40)
					    direction = Direction.DOWN;
					else if (alphaMove.getLine()==20 && alphaMove.getColumn()==40)
						direction = Direction.LEFT;
					else if (alphaMove.getLine()==20 && alphaMove.getColumn()==1)
						direction = Direction.UP;
					
					if (count==2) {
						alphaMove.hide();
						cancel();
						totalCount--;
						if (totalCount==0;)
						   VT100.reset();
						   VT100.cursorMove(21, 1);
						   System.out.println("Program End...");
						   timer.cancel();
					}
			}
			
		 }

  static Timer timer = new Timer();
	
	public static void main(String[] args) throws InterruptedException {
        VT100.clearScreen();
        
		for (int i=0; i<10; i++) {
        MoveTimerTask t = new MoveTimerTask();
        int speed = (int)(Math.random()*300 + 10);
        timer.schedule(t, 0, speed);
		}
		
//      VT100.reset();
      
        }
	}