package day08;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
		HashSet hs =new HashSet();
		System.out.println(123%10);
		hs.add("¶ó¸é");
		hs.add("±è¹ä");
		hs.add("¼ø´ë");
		hs.add("¿Àµ­");
		System.out.println("h2: "+hs);
		ArrayList arr= new ArrayList();
		arr.add("±è¹ä");
		arr.add("¶ó¸é");
		arr.add("±è¹ä");
		arr.add("¼ø´ë");
		System.out.println("arr : "+arr);
	}
}
