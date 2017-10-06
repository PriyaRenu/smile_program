/*smile program in applet*/

import java.applet.*;
import java.awt.*;
public class SmileyFace extends Frame
{
  public SmileyFace()
  {
    setTitle("Smiley Face");
    setSize(300, 300);
    setVisible(true);         
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.pink);	    
    g.fillOval(10,40,250,250);      // pinky round face
    g.setColor(Color.black);         // lines will be in black
   			
    g.fillOval(75, 80, 32, 32);       // left eye
    g.fillOval(180, 80, 32, 32);     // right eye
    	        
    g.drawArc(100,110,110,110,180,180);    // mouth
  }
  public static void main(String args[])
  {
    new SmileyFace();
  }
}