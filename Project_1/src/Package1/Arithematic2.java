package Package1;

public class Arithematic2 {
	
	public int multi(int a1, int a2) {
		int a3;
		a3= a1*a2;
		System.out.println("multi result"+a3);
		return a3;
	}
	public int sub(int b1, int b2) {
		int b3;
		b3= b1-b2;
		System.out.println("subresult"+ b3);
		return b3;
	}
	
    public int sum(int a, int b) {
		
		int c;
		c=a+b;
		System.out.println("sum result"+c);
		return c;
    }
    
  public void div(int c1, int c2) {
		
		int c3;
		c3=c1/c2;
		System.out.println("div result"+c3);
  }
  public static void main(String[] args)
  
  {
	  Arithematic2 ob=new Arithematic2();
		int multiresult=ob.multi(10, 2);
		int subresult=ob.sub(multiresult,2);
		int subresult1=ob.sub(subresult, 2);
		int sumresult=ob.sum(subresult1, 2);
		ob.div(sumresult, 2);
  }
	
}

  


