import java.util.*;

class Main {
	public static int[] parent;
	public static int find(int curr) {
		if(parent[curr] == curr)
			return curr;
		return parent[curr] = find(parent[curr]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n = sc.nextInt();
		parent = new int[num + 1];
		
		for(int i = 1; i <= num; i++)
			parent[i] = i;
		
		for(int i = 0; i < n; i++) {
			int left = sc.nextInt();
			int right = sc.nextInt();
			
			int rootX = find(left);
			int rootY = find(right);
			
			if(rootX != rootY)
				parent[rootX] = rootY;
		}
		
		int[] count = new int[num + 1];
		for(int i = 1; i <= num; i++)
			count[find(i)]++;
		
		int maxValue = 0;
		for(int i : count)
			maxValue = Math.max(maxValue, i);
		
		System.out.println(maxValue);
	}
}