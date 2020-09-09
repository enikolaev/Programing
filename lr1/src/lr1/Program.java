package lr1;

public class Program {

	public static void main(String[] args) {
		AutoPilot auto_driver = new AutoPilot();
		Human h_driver = new Human("Nikolaev E.I.");
		
		
		Vehicle vv = new Vehicle(auto_driver);
		
		System.out.println(vv.Info());
	}

}
