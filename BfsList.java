import java.util.*;

public class BfsList {

    static int n = 5;

    static ArrayList<Integer> graph[] = new ArrayList[n];

    static void bfs(int v) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            v = q.remove();
            System.out.print(v + " ");

            for (int w : graph[v]) {
                if (!visited[w]) {
                    visited[w] = true;
                    q.add(w);
                }
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[0].add(2);

        graph[1].add(0);
        graph[1].add(3);

        graph[2].add(0);
        graph[2].add(4);

        graph[3].add(1);

        graph[4].add(2);

        bfs(0);
    }
}
