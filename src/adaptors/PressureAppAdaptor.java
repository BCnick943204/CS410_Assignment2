package adaptors;
import sensor.PressureSensor;

public class PressureAppAdaptor implements AppSensor{

	private PressureSensor pSensor;
	
	public PressureAppAdaptor(PressureSensor pSensor){
	this.pSensor = pSensor;
	}
	
	@Override
	public double getValue() {
		return pSensor.readValue();
	}

	@Override
	public String getReport() {
		return pSensor.getReport();
	}

	@Override
	public String getSensorName() {
		return pSensor.getSensorName();

	}

}
