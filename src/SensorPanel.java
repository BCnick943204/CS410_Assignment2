import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.TitledBorder;

import adaptors.AppSensor;

public class SensorPanel extends JPanel{
	private AppSensor sensor;
	private double danger;
	private double critical;
	
	
	public SensorPanel(AppSensor sensor, double danger, double critical) {
		this.sensor = sensor;
		this.danger = danger;
		this.critical = critical;
		
		setLayout(null); //allows for items to be moved in panel
		
		double value = sensor.getValue();
		Color color;
		String message = sensor.getReport();
		//set the error messages and sensor values based on sensor output
		if(message.equals("DANGER")) {
			color = Color.red;
			message = "DANGER: " + value;
		}else if(message.equals("CRITICAL")) {
			color = Color.yellow;
			message = "CRITICAL: " + value;
		}else {
			color = Color.green;
			message = "OK: " + value;
		}
		
		//add a border with a title (title with sensor name)
		setBorder(new TitledBorder(sensor.getSensorName()));
		JLabel label = new JLabel(message);
		label.setBounds(50,50,150,50);
		add(label);
		
		//construct a progress bar to display value visually
		JProgressBar bar = constructProgressBar((int) (danger*1.2), (int)value, color);
		add(bar);
	}
	
	private JProgressBar constructProgressBar(int max, int value, Color color) {
		JProgressBar bar = new JProgressBar();
		bar.setUI(new CustomProgressUI(max,value));
		bar.setBounds(50,100,500,80);
		bar.setForeground(color);
	    bar.setIndeterminate(false);
	    bar.setBorderPainted(false);
	    return bar;
	}
	
}
