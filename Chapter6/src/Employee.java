
public class Employee {
	
	String name;		//이름
	int age;			//나이
	String address;		//주소
	String department;	//부서
	int salary;			//월급
	
	//생성자
	public Employee(String name, int age, String address, String department) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}
	
	//메소드
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : "+ address);
		System.out.println("부서 : " + department);
	}
	
	//하위 클래스에서 정의
	public void setSalary(int salary) {
	}
	
	//하위 클래스에서 정의
	public void setWorkHour(int workhour) {
	}

}
