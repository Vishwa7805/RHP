import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		
		int[] leftArray = new int[26];
		int[] rightArray = new int[26];
		for(char ch : str.toCharArray())
			rightArray[ch - 'a']++;
		
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			rightArray[ch - 'a']--;
			for(int j = 0; j < 26; j++) {
				if(leftArray[j] != 0)
					count += (leftArray[j] * rightArray[j]);
			}
			leftArray[ch - 'a']++;
		}
		
		System.out.println(count);
	}
}