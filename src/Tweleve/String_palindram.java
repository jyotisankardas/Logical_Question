package Tweleve;

public class String_palindram {
	
	public static void main(String[] args) {
		String s="madamjkn";
		String rev="";
		for(int i=0;i<=s.length()-1;i++) {
			rev=rev+s.charAt(i);
		}
		if(s==rev)
			System.out.println("This String is plindram");
		else
			System.out.println("This String is not a palindrm");
	}

}
