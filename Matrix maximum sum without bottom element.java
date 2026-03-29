import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] array = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++)
				array[i][j] = sc.nextInt();
		}
		
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < m; i++) {
			if(array[0][i] > firstMax) {
				secondMax = firstMax;
				firstMax = array[0][i];
			}
			else if(array[0][i] > secondMax)
				secondMax = array[0][i];
		}
		
		
		for(int i = 1; i < n; i++) {
			int fMax = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
			for(int j = 0; j < m; j++) {
				if(array[i - 1][j] == firstMax)
					array[i][j] += secondMax;
				else 
					array[i][j] += firstMax;
				
				if(array[i][j] > fMax) {
					sMax = fMax;
					fMax = array[i][j];
				}
				else if(array[i][j] > secondMax)
					sMax = array[i][j];
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			
			firstMax = fMax;
			secondMax = sMax;
		}
		
		System.out.println(firstMax);
	}
}