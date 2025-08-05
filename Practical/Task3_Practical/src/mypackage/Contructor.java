package mypackage;

class Student {
	String name;
	long RollNo;
	
	public Student(String name, long RollNo) {
		this.name=name;
		this.RollNo=RollNo;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+RollNo);
	}
}

public class Contructor {

	public static void main(String[] args) {
		Student s1 = new Student("Kundana",2420030558L);
		Student s2 = new Student("Veda",2420030001L);
		
		s1.display();
		s2.display();

	}

}
