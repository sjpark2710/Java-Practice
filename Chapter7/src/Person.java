
public class Person {
	
	String name ; 		//�̸�
	
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
