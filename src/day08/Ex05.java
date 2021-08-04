package day08;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap map =new HashMap();
		String key,value;
		System.out.println("저장할 키 입력");
		key=sc.next();
		System.out.println("저장할 값 입력");
		value=sc.next();
		map.put(key,value);
		System.out.println(map);
		
	}
}
