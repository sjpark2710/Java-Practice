
public class Person {
	
	String name ; 		//¿Ã∏ß
	
	Person(String name){
		this.name = name;
	}
	
	public boolean equsla(Person p) {
		if(this.name.equals(p.name)) {
			return true;
		}
		else {
			return false;
		}
	}
}
