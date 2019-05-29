package adaptors;
import sensor.TemperatureSensor;


public class TemperatureAppAdaptor implements AppSensor{

	private TemperatureSensor tSensor;
	
	public TemperatureAppAdaptor(TemperatureSensor tSensor) {
		this.tSensor = tSensor;
	}
	
	@Override
	public double getValue() {
		return tSensor.senseTemperature();
	}

	@Override
	public String getReport() {
		return tSensor.getTempReport();

	}

	@Override
	public String getSensorName() {
		return tSensor.getSensorType();
	}

}
