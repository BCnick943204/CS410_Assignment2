package adaptors;
import sensor.RadiationSensor;

public class RadiationAppAdaptor implements AppSensor{
	private RadiationSensor rSensor;
	
	public RadiationAppAdaptor(RadiationSensor rSensor) {
		this.rSensor = rSensor;
	}

	
	@Override
	public double getValue() {
		return rSensor.getRadiationValue();
	}

	@Override
	public String getReport() {
		return rSensor.getStatusInfo();

	}

	@Override
	public String getSensorName() {
		return rSensor.getName();

	}

}
