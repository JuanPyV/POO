
public class Activity24 {

	public static void main(String[] args) {
		
		Robot r1 = new Robot("Prime", "Optimus", 1980);
		DeliveryPlane p1 = new DeliveryPlane("747", 2015, 100);
		DeliveryDrone d1 = new DeliveryDrone("dron1", "Droncito", 2016, 90);
		Mailman m1 = new Mailman("Jaime");
		
		System.out.println(MailOffice.getFastestDelivery(p1, d1).stateYourName());
		System.out.println(MailOffice.getFastestDelivery(p1, m1).stateYourName());
		System.out.println(MailOffice.getFastestDelivery(m1, d1).stateYourName());
		
		System.out.println(MailOffice.getNewerRobot(r1, d1).getName());
	}

}
