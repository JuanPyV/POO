
public class Activity23 {

	public static void main(String[] args) {
		
		// no se puede inicializar objeto de clase abstracta
		// Computer c =  new Computer(3, 16);
		
		Mobile m = new Mobile(3, 16);
		Computer c = m;
		
		c.sendMail();
		m.sendMail();
		c.sendMail("gmo.rivas@gmail.com");
		m.sendMail("gmo.rivas@gmail.com");
		c.writeCode();
		m.writeCode();
	}

}
