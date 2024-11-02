package Package1;

public class Thiskeyword {
	
	public void m() {
		this.m3(76,90,25);
		System.out.println("Default method");
	}
    public void m1(int a) {
		this.m2(23,12);
		System.out.println("One Parameterized method");
	}
    
   public void m2(int a,int b) {
		this.m();
		System.out.println("Two Parameterized method");
	}
   public void m3(int a, int b, int c) {
		
		System.out.println("Three Parameterized method");
	}
   
   public void m4(int a, int b, int c, int d) {
		this.m1(44);
		System.out.println("Four Parameterized method");
	}
   
   public static void main(String[] args) {
	
	   Thiskeyword ob=new Thiskeyword();
	   ob.m4(56, 87, 33, 22);
}
   
   
}
	
	
	
	
	
	
