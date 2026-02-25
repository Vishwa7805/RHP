//Program to find wheather palindrome can be formed
//Only lower case letters are in the string

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