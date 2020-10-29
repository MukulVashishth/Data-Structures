import java.util.*;
public class DFS{
	public static void main(String[] args){
		
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while (t-->0){
			int n=sc.nextInt();
			int ar[][]=new int[n+1][n+1];
			for (int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					ar[i][j]=sc.nextInt();
				}
			}
			boolean visited[]=new boolean[n+1];
			dfs(ar,1,visited,n);
			System.out.println();
		}
	}
	public static void dfs(int[][] ar,int u,boolean visited[],int n){
		if (!visited[u]){
			System.out.print(u +" " );
			visited[u]=true;
			for (int v=1;v<=n;v++){
				if (ar[u][v]==1 && !visited[v]){
					dfs(ar,v,visited,n);
				}
			}
		}
	}
}
