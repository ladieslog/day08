package day08;

public class Quiz03_t3 {
	public static void main(String[] args) {
		//4
		String str ="�谳��-2017��\nȫ�浿����-2015\n���켱��-2018";
		/*
		System.out.println("before:\n"+str);
		System.out.println();
		str=str.replace("0", "9");
		str=str.replace("1", "9");
		str=str.replace("2", "1");
		str=str.replace("-", ":");
		System.out.println("after:\n"+str);*/
		
		System.out.println("====���� �� str====\n"+str);
		str = str.replace("-", ":");
		String[] arrStr = str.split("\n");
		str="";
		for(int i=0;i<arrStr.length;i++) {
			String[] reStr = arrStr[i].split(":");
			reStr[1]=reStr[1].replace(reStr[1], "1999��");
			//reStr[1]="1999��";
			str+=(reStr[0]+":"+reStr[1]+"\n");
		}
		System.out.println("====���� �� str====\n"+str);
	}
}
