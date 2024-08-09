package Package;

public class class_1 {
	int a;
	public void display() // display is the method
	{
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args) {
		class_1 sukerti=new class_1();
        sukerti.display();   
		System.out.println("I am the main method");
		sukerti.display();
		sukerti.a=34;
		System.out.println(" Value of a"+ sukerti.a);
	}

}