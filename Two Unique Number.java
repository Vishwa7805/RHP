import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		int result = 0;
		
		for(int i : array)
			result ^= i;
		
		int setBit = result & -result;
		
		int groupA = 0, groupB = 0;
		for(int i : array) {
			if((i & setBit) == 0)
				groupA ^= i;
			else
				groupB ^= i;
		}
		
		System.out.println(groupA + " " + groupB);
	}
}