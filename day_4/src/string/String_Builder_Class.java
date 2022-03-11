package string;

public class String_Builder_Class {

	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder("Hello ");
		System.out.println("String is:"+sb);
		sb.append("World");
		System.out.println("After Appending,String is : "+sb);
		sb.insert(11,"Asmi ");
		System.out.println("After Inserting String is :"+sb);
		sb.reverse();
		System.out.println("After Reverse, string is : "+sb);
		sb.delete(12, 20);
		System.out.println("After Deleting, string is : "+sb);
		sb.replace(0,6,"*");
		System.out.println("After Replacing, string is : "+sb);
		System.out.println(sb.length());
		
		

	}

}
