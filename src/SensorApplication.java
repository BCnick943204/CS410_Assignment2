
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

import adaptors.PressureAppAdaptor;
import adaptors.RadiationAppAdaptor;
import adaptors.TemperatureAppAdaptor;
import sensor.PressureSensor;
import sensor.RadiationSensor;
import sensor.TemperatureSensor;

	public class SensorApplication extends JFrame {
		
		public SensorApplication() {
			setTitle("Sensor Tracker");
			setLayout(new GridLayout(3,1));
		
			//Construct all sensor panels, with each given an adapted version of the sensor
			SensorPanel temperature = new SensorPanel(new TemperatureAppAdaptor(new TemperatureSensor()),300,235);
			SensorPanel pressure = new SensorPanel(new PressureAppAdaptor(new PressureSensor()),6.58,5);
			SensorPanel rad = new SensorPanel(new RadiationAppAdaptor(new RadiationSensor()),4,3);

			//add the panels
			add(temperature);
			add(pressure);
			add(rad);
			setPreferredSize(new Dimension(600,600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			pack();
		}
		

		public static void main(String[] args) {
			SensorApplication app = new SensorApplication();
		}

	}


