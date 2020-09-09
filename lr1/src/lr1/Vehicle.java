package lr1;

public class Vehicle {
	private Engine e;
	private IDriver dr;
	
	public Vehicle(IDriver pDriver) {
		e = new Engine();
		dr = pDriver;
	}
	
	public String Info() {
		return dr.getType();
	}
}
