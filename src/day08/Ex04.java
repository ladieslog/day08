package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		//Map , Hashmap ,TreeMap, HashTable 
		//HashMap map =new HashMap();
		LinkedHashMap map=new LinkedHashMap();
		map.put("��ǳ��", "10����");
		map.put("�ڵ���", "1000����");
		map.put("������", "30����");
		System.out.println(map);
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.get("��ȭ��"));
		System.out.println(map.containsKey("������"));
		System.out.println(map.containsValue("30����"));
		System.out.println(map.remove("�ڵ���"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println();
		Set s=map.keySet();
		String key;
		Iterator it =s.iterator();
		while(it.hasNext()){
			key=(String)it.next();
			System.out.println(key +" : "+map.get(key));
		}
	}
}
