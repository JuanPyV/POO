
public class Mailman implements Transporter{

		String name;

		public String getName() {
			return name;
		}

		public Mailman(String name) {
			this.name = name;
		}
		
		public void Deliver() {
			System.out.println("Entregado........");
		}

		@Override
		public float calculateSpeed() {
			return 5;
		}

		@Override
		public String stateYourName() {
			return name;
		}
		
		
}
