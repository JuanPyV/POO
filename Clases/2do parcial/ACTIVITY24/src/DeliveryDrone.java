
public class DeliveryDrone extends Robot implements Transporter {

	private float speed;
	
	public float getSpeed() {
		return speed;
	}
	
	public DeliveryDrone(String model, String name, int year, float speed) {
		super(model, name, year);
		this.speed = speed;
	}
	
	@Override
	public float calculateSpeed() {
		return speed;
	}

	@Override
	public String stateYourName() {
		return getName();
	}
}
