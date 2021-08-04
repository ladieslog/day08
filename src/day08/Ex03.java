package day08;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		HashSet set =new HashSet();
		set.add("¿œ");
		set.add("¿Ã");
		set.add("ªÔ");
		Object o;
		String s;
		System.out.println("set : "+set);
		Iterator it=set.iterator();
		while(it.hasNext()) {
			//o=it.next();s=(String) o;
			s=(String)it.next();
			System.out.println(s);
		}
	}
}
