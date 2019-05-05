package scripting_bot;
import java.awt.Robot;
import java.awt.event.InputEvent;


public class scripts {
	public static void main(String[] args){		
		int numberOfFields = 17;
		
		wait(3000);
		
		for(int j = 0; j < 3; j++){
		mouseMove(750, 580);//initial position
		leftClick();

		for(int i = 0; i < numberOfFields; i++){
		typeWord("terrence ju");
		pressKey(9);
		}
		
		pressKey(10);
		
		wait(2000);
		
		mouseMove(125, 50); //open
		
		leftClick();

		wait(2000);
		
		}
	}
	
	public static void wait(int millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void mouseMove(int x, int y){
        try{
        	Robot robot = new Robot();
	        robot.mouseMove(x, y);
        } catch(Exception e){
        	e.printStackTrace();
        }
	}

	public static void rightClick(){
        try{
        	Robot robot = new Robot();
        
		robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        } catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	public static void leftClick(){
        try{
        	Robot robot = new Robot();
        
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	public static void typeWord(String s){
		for(int i = 0; i < s.length(); i++){
			int asciiVal;
			
			if(s.charAt(i)!=32){
			asciiVal = s.charAt(i) - 32;
			} else{
				asciiVal = 32;
			}
			pressKey(asciiVal);
			
		}
	}
	
	public static void pressKey(int keyNum){
        try{
        	Robot robot = new Robot();
        
		robot.keyPress(keyNum);
		robot.keyRelease(keyNum);
        } catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	public static void mouseScroll(int ticks){
        try{
        	Robot robot = new Robot();
        
        	robot.mouseWheel(ticks);
        } catch(Exception e){
        	e.printStackTrace();
        }
	}
	
}
