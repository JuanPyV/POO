
public class DeliveryDrone extends Robot implements Transporter{
	
	public DeliveryDrone(String model, int year, String name) {
		super(model, year, name);
	}

	public int speed;

	public int getSpeed() {
		return speed;
	}

	public DeliveryDrone(String model, int year, String name, int speed) {
		super(model, year, name);
		this.speed = speed;
	}

	@Override
	public float calculateSpeed() {
		return speed;
	}

	@Override
	public String stateYourName() {
		return name;
	}
	
	
}
