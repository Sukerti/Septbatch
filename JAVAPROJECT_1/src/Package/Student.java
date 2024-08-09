package Package;

public class Student{
	// variable declaration
	int Rollno;
	int age;
	// method declaration
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	//Main method
	public static void main(String[] args) {
		//object creation
		Student s1=new Student();
	    s1.display1();
		s1.display2();
		s1.age=30;
		s1.Rollno=2024;
		System.out.println("Student age is"+s1.age);
		System.out.println("Student Rollno is"+ s1.Rollno);
	    
	}
		

}

