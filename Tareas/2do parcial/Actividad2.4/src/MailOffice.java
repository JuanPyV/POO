
public class MailOffice {

	public static Robot getNewerRobot(Robot r1, Robot r2) {
		if (r1.getYear() > r2.getYear()) {
			return r1;

		} else {
			return r2;
		}
	}

}
