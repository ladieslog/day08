package day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		Iterator it =arr.iterator();
		//System.out.println(it.hasNext());	//다음값은 있나?
		//System.out.println(it.next());		//다음 위치이동및 가져오기
		
		int i;
		for (i=0;i<arr.size();i++) {
			System.out.println(it.hasNext());
			System.out.println(it.next());
		}
		
		Iterator its=arr.iterator();
		while(its.hasNext()==true) {
			System.out.println(its.next());
		}
		
	}
	
}
