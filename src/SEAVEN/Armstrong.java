package SEAVEN;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Integer i=371;
		Integer j=i;
		int d=0;
		boolean flg=false;
		while(i>0) {
			int c=i%10;  //1
			i=i/10;
			
			d=d+(c*c*c);
			if(d==j)
				flg=true;
		}
		if(flg==true)
			System.out.println("arm");
	}

}
