
public class Main {

	public static void main(String[] args) {

		Mobile huawei = new Mobile(5, "SSD");
		huawei.sendMail();
		huawei.writeCode();

		Computer asus = huawei;
		asus.sendMail();
		asus.sendMail(asus.getScreen());
		asus.sendMail(asus.getStorage());

	}
}
