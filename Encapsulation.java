package package2;

public class Encapsulation {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
	class test{
    public static void name(String args[]) {
		Encapsulation s  = new Encapsulation();
		s.setName("sunil");
		
		System.out.println(s.getName());
	}
	}


