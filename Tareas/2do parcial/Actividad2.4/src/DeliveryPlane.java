
public class DeliveryPlane implements Transporter{
	
	public String model;
	public int year;
	public int speed;
	
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public int getSpeed() {
		return speed;
	}
	
	public DeliveryPlane(String model, int year, int speed) {
		super();
		this.model = model;
		this.year = year;
		this.speed = speed;
	}
	
	@Override
	public float calculateSpeed() {
		return (float) (speed*.8);
	}
	@Override
	public String stateYourName() {
		return model;
	}
	
	
	
	
	

}
