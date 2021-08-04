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
			System.out.print("1. 메뉴 등록\n2.메뉴별 가격 보기\n"
					+ "3.종료 \n>>> ");
			a=sc.nextInt();
			
			if(a==1) {	
				System.out.println("저장할 키 입력");
				manu=sc.next();
					if(map.containsKey(manu)) {
						System.out.println("메뉴가 겹칩니다.");
					}else {
						System.out.println("저장할 값 입력");
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
					System.out.print("1.수정 2.삭제 3.나가기\n>>> ");
					b=sc.nextInt();
					
					if(b==1) {
						
						System.out.println("변경 메뉴이름 입력: ");
						re_manu=sc.next();
						if(map.containsKey(re_manu)) {
							System.out.println("수정가격 입력해주세요");
							re_price=sc.next();
							map.remove(re_manu);
							map.put(re_manu, re_price);
						}else {
							System.out.println("보기 없는 메뉴입니다.");
						}
					}
					else if(b==2) {
						
						System.out.println("변경 메뉴이름 입력: ");
						del_manu=sc.next();
						if(map.containsKey(del_manu)) {
							map.remove(del_manu);
						}else {
							System.out.println("보기 없는 메뉴입니다.");
						}
					}
					else if(b==3) {
						break;
					}
					else {
						 System.out.println("보기 번호가 없습니다.");
					}
				}
			}
						
			else if(a==3) {
				System.out.println("프로그램을 종료합니다.");break;
			}
			else{
				System.out.println("보기 없는 번호입니다.");
			}
		}
	}		
}

