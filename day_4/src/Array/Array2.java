package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 
{

	public static void main(String[] args) 
	{
   ArrayList a=new ArrayList();
   a.add("a");
   a.add("b");
   a.add("c");
   a.add(100);
   a.add(1);
   
   System.out.println(a.size());
   System.out.println(a);
   
   Iterator data = a.iterator();
   while(data.hasNext())
   {
	  System.out.println(data.next()); 
   }
   a.remove(4);
   System.out.println(a);
  
   System.out.println(a.contains("C"));

	}

}
