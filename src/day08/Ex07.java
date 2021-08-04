package day08;

public class Ex07 {
	public static void main(String[] args) {
		String str =new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		
		str +="æ»≥Á«œººø‰";
		System.out.println(str);
		System.out.println(str.charAt(0) =='a');
		System.out.println(str.equals("abc"));
		System.out.println();
		System.out.println(str.charAt(0)=='a');
		System.out.println(str.charAt(2)=='e');
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
		String otr="           Have a great day    ";
		String result =otr.trim();
		System.out.println("1. "+otr);
		System.out.println("2. "+result);
		String inputId="abcd    ";
		System.out.println(inputId);
		
		System.out.println();
		String[] split=result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		
		System.out.println();
		String replace =result.replace(" ", "/");
		System.out.println(replace);
	}
}















