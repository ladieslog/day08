package day08;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap map =new HashMap();
		String key,value;
		System.out.println("������ Ű �Է�");
		key=sc.next();
		System.out.println("������ �� �Է�");
		value=sc.next();
		map.put(key,value);
		System.out.println(map);
		
	}
}
