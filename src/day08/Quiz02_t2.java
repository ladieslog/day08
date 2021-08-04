package day08;

import java.util.ArrayList;

public class Quiz02_t2 {
	public static void main(String[] args) {
		int i,n=0,x=0,y=0,z=0;
		ArrayList arr=new ArrayList();
		String word1 =new String("Have a nice day Have a nice day Have a nice day");
		for(i=0;i<word1.length();i++) {
			if(word1.charAt(i)=='a') {
				arr.add(i);			
			}			
		}
		System.out.println(arr);
		System.out.println();
		
		String word2=("It is a fun java programming");
		for(i=0;i<word2.length();i++) {
			if(word2.charAt(i)=='a') {				
				x++;			
			}else if(word2.charAt(i)=='g') {				
				y++;			
			}
			z++;
		}
		System.out.println("총개수 : "+ z+"\na 개수 :"+x+"\ng 개수 : "+y);
		System.out.println();
		
		
		/*
		String[] result1,result3;
		String word3 = ("tESt sTring      change      first");
		word3 =word3.toLowerCase();
		result1 =word3.split(" ");
		System.out.println(result1[2]);
		for(i=0;i<result1.length;i++) {
			//result3=(result2[i].charAt(0));
		}
		*/
	}
}


















