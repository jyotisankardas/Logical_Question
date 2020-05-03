package TEN;

public class Factorial_Number {
	public static void main(String[] args) {
		int n = 6;
		int count = 0;
		int tem = 1;
		for (int i = 1; i <= n; i++) {
			count++;
			tem = tem * count;
		}

		System.out.println(tem);
		
		

	}

}
