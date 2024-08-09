package Package;

public class Maths1 {
	public int div(int a, int b) {
		int c;
		c =a/b;
		System.out.println("result is"+ c);
		return c;
	}
	public int sub(int a1, int b1) {
		int c1;
		c1= a1-b1;
		System.out.println("result is"+ c1);
		return c1;
	}
	public int multi(int a2, int b2) {
		int c2;
		c2 =a2*b2;
		System.out.println("result is" + c2);
		return c2;						
	}
	public void sum (int a3, int b3) {
		int c3;
		c3 = a3+b3;
		System.out.println("result is" + c3);
				
	}
	public static void main(String[] args) {
		Maths1 obj= new Maths1();
		int divresult = obj.div(10,2);
		int subresult = obj.sub(divresult,2);
		int multiresult = obj.multi(subresult,2);
		int subresult1 = obj.sub(multiresult,2);
	    obj.sum(subresult1,2);
	}
	
		

}
