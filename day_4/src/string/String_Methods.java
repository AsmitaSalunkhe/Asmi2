package string;

public class String_Methods {

	public static void main(String[] args)
	{
		String s1=new String("Hello Welcome");
		System.out.println(s1);
		System.out.println(s1.charAt(0));
		System.out.println("Length of a string is: "+s1.length());
		System.out.println("Get the substring value:"+s1.substring(5,13));
		System.out.println("Check whether s1 contains Welcome:(T/F):"+s1.contains("Welcome"));
		System.out.println("Equality(T/F): "+s1.substring(5,13));
		System.out.println("Equals ignorecase(T/F)"+s1.equalsIgnoreCase("Hello Welcome"));
		System.out.println("Replace of all the occurances:"+s1.replace('l','*'));
		System.out.println("check String is empty(T/F):"+s1.isEmpty());
		System.out.println("Convert to Uppercase:"+s1.toUpperCase());
		System.out.println("Convert to Lowercase:"+s1.toLowerCase());
		
		String[] s3=s1.split(" ");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		
		String s2="       Hello        ";
		System.out.println(s2.trim());
		
		

	}

}
