
public class MailOffice {

	/* static
	 * 
	 * qué significa que un miembro sea estático - 
	 * no hay copia por objeto
	 * pertenece directo a la clase 
	 */
	
	public static Transporter getFastestDelivery(Transporter t1, Transporter t2) {
		if(t1.calculateSpeed() > t2.calculateSpeed())
			return t1;
		return t2;
	}
	
	public static Robot getNewerRobot(Robot r1, Robot r2) {
		
		if(r1.getYear() > r2.getYear())
			return r1;
		return r2;
	}
}
