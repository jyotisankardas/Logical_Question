package Three;

public class Find_Common_Element {
	
	public static void main(String[] args) {
		
		int i[]= {1,4,7,9,2};
		int j[]= {1,7,3,4,5};
		for(int k=0;k<=i.length-1;k++) {
			for(int h=0;h<=j.length-1;h++) {
				if(i[k]==j[h]) {
					System.out.println(i[k]);
				}
			}
			
		}
	}

}
