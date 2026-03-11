import java.util.*;

class DfsMatrix {

    static int n = 5;

    static int graph[][] = {
        {0, 1, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 0, 0},
        {0, 0, 1, 0, 0}
    };

    static boolean visited[];

    static void dfs_start() {
        visited = new boolean[n];
        Arrays.fill(visited, false);
        dfs(0);
    }

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int w = 0; w < n; w++) {
            if (graph[v][w] == 1 && !visited[w]) {
                dfs(w);
            }
        }
    }

    public static void main(String[] args) {
        dfs_start();
    }
}
