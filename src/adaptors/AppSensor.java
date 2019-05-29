package adaptors;

public interface AppSensor {
	//return the value of the sensor output
	public double getValue();
	//return how serious the value reported is (e.g. if it is CRITICAL)
	public String getReport();
	//return the name of the sensor
	public String getSensorName();
}
