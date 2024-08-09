package Package;

public class Maths {
	public int sum (int a, int b) {
		int c;
		c =a+b;
		System.out.println("result is"+ c);
		return c;
	}
	public int multi (int a1, int b1) {
		int c1;
		c1 =a1+b1;
		System.out.println("result is" + c1);
		return c1;
	}
	public int sub (int a2 , int b2) {
		int c2;
		c2 =a2-b2;
		System.out.println("result is"+ c2);
		return c2;
	}
	public void div(int a3, int b3) {
		int c3;
		c3 =a3/b3;
					System.out.println("Final result is"+ c3 );
	}
public static void main(String[] args) {
	Maths obj = new Maths();
	int sumresult = obj.sum(10,2);
	int multiresult = obj.multi (sumresult,2);
	int subresult = obj.sub (multiresult,2);
	int multiresult1 = obj.multi (subresult,2);
	obj.div (multiresult1,2);
	
	
	
			
}
}
