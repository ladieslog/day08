package day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add("��");
		arr.add("��");
		arr.add("��");
		Iterator it =arr.iterator();
		//System.out.println(it.hasNext());	//�������� �ֳ�?
		//System.out.println(it.next());		//���� ��ġ�̵��� ��������
		
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
