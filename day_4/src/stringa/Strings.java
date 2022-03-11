package stringa;

public class Strings {

	public static void main(String[] args)
	{
		String s1="Asmi";
		String s2="Asmi";
		
		System.out.println(s1);
	    System.out.println(s2);
		
	    if (s1==s2)
		 {
			 System.out.println("s1 and s2 are Equal"); 
		 }
	 if (s1.equals(s2)) 
	 {
		 System.out.println("s1 and s2 are Equal");

	 }
	 s1=s1.concat("Trainer");
	 System.out.println("s3 value is "+s1);
	 
	 String a1=new String("Hii...");
	 String a2=new String("Hii...");
	 
	 if(a1==a2)
	 {
		 System.out.println("a1 is equal to a2");
		 
	 }
	 else
	 {
		 System.out.println("a1 is not equal to a2");
	 }
	  if (a1.equals(a2))
	  {
		System.out.println("a1 is equal to s2"); 
	  }

	}

}
