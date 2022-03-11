package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Integer_4{

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(100);
		a.add(50);
		a.add(29);
		a.add(300);
		
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
		
		Iterator data=a.iterator();
		while (data.hasNext()) 
		{
			System.out.println(data.next());
		} 
		for (int c:a)
		{
			System.out.println(c+100);
		}
		
     }
}
