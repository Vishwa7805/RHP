//Program to find wheather the string has a to z
//A to Z are not counter and there are only lower case letter in the string

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int flag = 0;
		
		for(char ch : str.toCharArray()) {
			flag ^= 1 << (ch - 'a');
		}
		
		if(flag == 0 || (flag & (flag - 1)) == 0)
			System.out.println("Palindrome can be formed");
		else
			System.out.println("Palindrome cannot be formed");
	}
}