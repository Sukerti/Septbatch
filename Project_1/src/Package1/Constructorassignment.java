package Package1;

public class Constructorassignment {
	
	public Constructorassignment() {
		this(56,98,76);
		System.out.println("Default constructor");
		
	}
	
    public Constructorassignment(int a) {
    	
		this(43,23);
		System.out.println("One Paramtereized constructor");
		
    }
    
   public Constructorassignment(int a, int b) {
		this ();
		System.out.println("Two Paramtereized constructor");
		
		
   }
   
   public Constructorassignment(int a, int b, int c) {
		
		System.out.println("Three Paramtereized constructor");
	
   }
   
   public static void main(String[] args) {

	
	   Constructorassignment ob=new Constructorassignment(87);
	   
   }

   
   
}
	   
	  
   
   
	
	
	
	
	

	

