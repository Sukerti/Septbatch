package Package1;

public class Arithematic {
	
	public int sum(int a, int b) {
		
		int c;
		c=a+b;
		System.out.println("sum result"+c);
		return c;
	}
	public int sub(int d, int e) {
		int f;
		f= d-e;
		System.out.println("sub result"+f);
		return f;
		
		
	}
	public int multi(int a1, int a2) {
		int a3;
		a3= a1*a2;
		System.out.println("multi result"+a3);
		return a3;
		
}
	public void div(int a4, int a5) {
		int a6;
		a6= a4/a5;
		System.out.println("div result"+a6);
	}
	public static void main(String[] args)
	
	{
		Arithematic ob=new Arithematic();
		int sumresult=ob.sum(10, 2);
		int subresult=ob.sub(sumresult,2);
		int sumresult1=ob.sum(subresult, 2);
		int multiresult=ob.multi(sumresult1, 2);
		ob.div(multiresult, 2);
	}
}
	

	
	