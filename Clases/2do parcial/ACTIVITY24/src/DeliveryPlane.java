
public class DeliveryPlane implements Transporter {

	private String model;
	private int year;
	private float maxSpeed;
	
	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}
	
	public DeliveryPlane(String model, int year, float maxSpeed) {
		super();
		this.model = model;
		this.year = year;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public float calculateSpeed() {
		return maxSpeed * 0.8f;
	}

	@Override
	public String stateYourName() {
		return model;
	}


}
