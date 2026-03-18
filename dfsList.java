import java.util.*;

class dfsList {

    static int n = 5;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static boolean visited[];


    static void dfs_Start() {
        visited = new boolean[n];
        Arrays.fill(visited, false);
        dfs(0);
    }


    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int w : adj.get(v)) {
            if (!visited[w]) {
                dfs(w);
            }
        }
    }

    public static void main(String args[]) {

       
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(1);

        adj.get(4).add(2);


        dfs_Start();
    }
}
	
