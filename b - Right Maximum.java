import java.util.*;

class Main {
	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int j = 0; j < n; j++)
			array[j] = sc.nextInt();
		
		int count = 1;
		int maxValue = array[0];
		for(int i = 1; i < n; i++) {
			if(array[i] >= maxValue) {
				maxValue = array[i];
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- != 0) {
			solve(sc);
		}
	}
}