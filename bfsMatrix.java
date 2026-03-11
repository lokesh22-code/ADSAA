import java.util.*;

public class bfsMatrix{

    static int n = 5;

    static int graph[][] = {
        {0, 1, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 0, 0},
        {0, 0, 1, 0, 0}
    };

    static void bfs(int v) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            v = q.remove();
            System.out.print(v + " ");

            for (int w = 0; w < n; w++) {
                if (graph[v][w] == 1 && !visited[w]) {
                    visited[w] = true;
                    q.add(w);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs(0);
    }
}
