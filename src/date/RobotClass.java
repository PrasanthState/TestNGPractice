package date;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

	public class RobotClass {
		
		public static void main(String[] args) throws IOException, AWTException {
			String command = "notepad.exe";
			Runtime run= Runtime.getRuntime();
			run.exec(command);
			Robot rbt = new Robot();	
		}
	}
