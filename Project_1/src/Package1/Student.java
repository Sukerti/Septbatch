package Package1;
// boundary or body of the class
public class Student {
	
	int rollno;
	int age;
	public void display1() 
	{
		
		System.out.println("Welcome to all of you");
		
	}
	
	public void display2() {
		
		System.out.println("Automation is very easy");
		
	}
	public static void main(String[] args) {
		
		Student sukerti=new Student();
		sukerti.rollno= 50;
		System.out.println("Value of rollno"+ sukerti.rollno);
		sukerti.age= 33;
		System.out.println("Value of age" + sukerti.age);
		sukerti.display1();
		sukerti.display2();
		Student ramesh= new Student();
		ramesh.rollno=34;
		System.out.println("Value of rollno"+ ramesh.rollno);
		ramesh.age=23;
		System.out.println("Value of age"+ ramesh.age);
		ramesh.display1();
		ramesh.display2();
		
		
		
		
				
		
		
		
		
	}

}
