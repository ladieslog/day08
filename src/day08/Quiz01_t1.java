package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;



public class Quiz01_t1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		LinkedHashMap map =new LinkedHashMap();
		String manu,price,re_manu,re_price,del_manu;
		int a,b,i,n=0;
		
		while(true) {
			System.out.print("1. �޴� ���\n2.�޴��� ���� ����\n"
					+ "3.���� \n>>> ");
			a=sc.nextInt();
			
			if(a==1) {	
				System.out.println("������ Ű �Է�");
				manu=sc.next();
					if(map.containsKey(manu)) {
						System.out.println("�޴��� ��Ĩ�ϴ�.");
					}else {
						System.out.println("������ �� �Է�");
						price=sc.next();
						map.put(manu,price);
					}
					System.out.println();
			}
			else if(a==2) {
				Set s=map.keySet();
				String key;
				Iterator it =s.iterator();
				
				while(true) {
					for(i=0;i<map.size();i++) {
						key=(String)it.next();
						System.out.println((i+1)+". "+key +" : "+map.get(key));
					}
					System.out.print("1.���� 2.���� 3.������\n>>> ");
					b=sc.nextInt();
					
					if(b==1) {
						
						System.out.println("���� �޴��̸� �Է�: ");
						re_manu=sc.next();
						if(map.containsKey(re_manu)) {
							System.out.println("�������� �Է����ּ���");
							re_price=sc.next();
							map.remove(re_manu);
							map.put(re_manu, re_price);
						}else {
							System.out.println("���� ���� �޴��Դϴ�.");
						}
					}
					else if(b==2) {
						
						System.out.println("���� �޴��̸� �Է�: ");
						del_manu=sc.next();
						if(map.containsKey(del_manu)) {
							map.remove(del_manu);
						}else {
							System.out.println("���� ���� �޴��Դϴ�.");
						}
					}
					else if(b==3) {
						break;
					}
					else {
						 System.out.println("���� ��ȣ�� �����ϴ�.");
					}
				}
			}
						
			else if(a==3) {
				System.out.println("���α׷��� �����մϴ�.");break;
			}
			else{
				System.out.println("���� ���� ��ȣ�Դϴ�.");
			}
		}
	}		
}

