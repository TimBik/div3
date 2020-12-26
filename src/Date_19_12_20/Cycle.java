package Date_19_12_20;

import java.util.*;

public class Cycle {


    static ArrayList<Integer>[] graph;
    static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            graph[x].add(y);
            graph[y].add(x);
        }
        used = new boolean[n];
        dfs(0, -1);
        for (int i = 0; i < path.size(); i++) {
            System.out.print((path.get(i) + 1) + " ");
        }
    }

    static ArrayList<Integer> path = new ArrayList<>();

    private static int dfs(int v, int p) {
        used[v] = true;
        for (int i = 0; i < graph[v].size(); i++) {
            int vv = graph[v].get(i);
            if (vv == p) continue;
            if (used[vv]) {
                path.add(vv);
                path.add(v);
                return vv;
            }
            int status = dfs(vv, v);
            if (status != -1) {
                if (status == v || status == -2) {
                    return -2;
                }
                path.add(v);
                return status;
            }
        }
        return -1;
    }
}

