
public class Faculty extends Person{
	
	public String univ;
	public long number;
	
	public Faculty(String name, long number, String univ, long idNumber) {
		super(name, number);
		this.univ = univ;
		this.number = number;
	}
	
	public long getSNumber() {
		return super.number;
	}

}
