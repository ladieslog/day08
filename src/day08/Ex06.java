package day08;

import java.util.Scanner;


public class Ex06 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String str;
		System.out.println("���ڿ� �Է�");
		str=input.next();
		System.out.println(str);
		
		str ="java is MAN";
		String changeStr =new String();
		changeStr =str.toUpperCase();
		System.out.println("��ȯ : "+changeStr);
		changeStr =str.toLowerCase();
		System.out.println("��ȯ : "+changeStr);
	}
}
