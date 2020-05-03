package Seventen;

public class Count_Total_Vowel {
	
	public static void main(String[] args) {
		String s="rama is a good boy";
		
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
		}
		System.out.println(count);

	}

}
