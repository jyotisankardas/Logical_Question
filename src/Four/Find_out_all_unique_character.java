package Four;

public class Find_out_all_unique_character {
	
	public static void main(String[] args) {
		String s="javsj";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length()-1;j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
			
			
		}
			
	}
if(count==0) {
	System.out.println("common");
}else
	System.out.println("duplicate element");
	}
}
