
import java.util.Scanner;

public class Student extends Person{
	
	String school;			//학교
	String department;		//학과
	int classNum;			//학번
	double score[];			//점수 배열
	
	//생성자
	Student(String name, int age, String address, String school, String department, int classNum){
		super(name, age, address);
		this.school = school;
		this.department = department;
		this.classNum = classNum;
		score = new double[8];
	}
	
	//평균 구하기
	double average() {
		double sum = 0;
		for(double i : score) {
			sum += i;
		}
		return sum/score.length;
	}
	
	public void printInfo() {
		Scanner s = new Scanner(System.in);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("학교 : " + school);
		System.out.println("학과 : " + department);
		System.out.println("학번 : " + classNum);
		System.out.println("========================");
		System.out.println("8학기 학점을 순서대로 입력하세요");
		for(int i = 0 ; i <score.length; i++) {
			System.out.print(i + 1 + "학기 학점 ->");
			score[i] = s.nextDouble();
		}
		System.out.println("=======================");
		System.out.println("8학기 총 평균 평점은" + average() + "점 입니다.");
	}

}
