package Fourten;

public class Max_value_in_Array {
	
	public static void main(String[] args) {
		 int ar[]= {1,7,91,12,57};
		 int temp= 0;
		 for(int i=0;i<=ar.length-1;i++) {
			 for(int j=0;j<=ar.length-1;j++) {
				 if(ar[i]<ar[j]) {
					 temp=ar[j];
					 ar[i]=temp;
				 }
			 }
			
		 }
		 System.out.println(temp);
	}

}
