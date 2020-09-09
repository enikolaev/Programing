package lr1;

public class Human implements IDriver {
	private String name_n; 
	
	@Override
	public String getType() {		
		return "I'm your Driver. My name is " + name_n;
	}
	
	public Human(String pName) {
		name_n = pName;
	}

}
