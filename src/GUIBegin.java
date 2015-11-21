import java.awt.*;
import javax.swing.*;

public class GUIBegin {

		public static void main(String[] args){
			JFrame myFrame = new JFrame();
			myFrame.setSize(200, 100);
			myFrame.setVisible(true);
			
			int increment = 1;
			int counter = 0;
			
			while(true){
				Dimension frameDim = myFrame.getSize();
				System.out.println(frameDim.width + ", " + frameDim.height);
				myFrame.setSize(frameDim.width+increment, frameDim.height+increment);
				
				if(counter == 300){
					increment *= -1;
					counter = 0;
				}
				counter++;
			}
			
		}
}
