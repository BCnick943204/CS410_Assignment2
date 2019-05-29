import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class CustomProgressUI extends BasicProgressBarUI{
	private double value=0;
	private double max=1;
	//initialize rectangle values
	  Rectangle r = new Rectangle();
	  CustomProgressUI(int max,int value){
		  this.value=value;
		  this.max=max;
	  }
	  //draw the bar with specified dimensions
	  @Override
	  protected void paintDeterminate(Graphics g, JComponent c) {
	    Graphics2D g2d = (Graphics2D) g;
	    r = new Rectangle((int)((value/max)*400), 50);
	    g.setColor(progressBar.getForeground());
	    g.fillRect(r.x, r.y, r.width, r.height);
}
	  public void setValue(int i) {
		  value = i;
	  }
}
