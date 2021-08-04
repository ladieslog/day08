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
		map.put("선풍기", "10만원");
		map.put("자동차", "1000만원");
		map.put("에어컨", "30만원");
		System.out.println(map);
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("전화기"));
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map.containsValue("30만원"));
		System.out.println(map.remove("자동차"));
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
