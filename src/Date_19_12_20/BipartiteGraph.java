package Date_19_12_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BipartiteGraph {


    static ArrayList<Integer>[] graph;
    static boolean[] used;
    static int[] colors;

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
        colors = new int[n];
        Arrays.fill(colors, -1);
        if (dfs(0, 0)) {
            for (int i = 0; i < n; i++) {
                System.out.print(colors[i] + " ");
            }
        }
    }

    private static boolean dfs(int v, int c) {
        used[v] = true;
        colors[v] = c;
        for (int i = 0; i < graph[v].size(); i++) {
            int vv = graph[v].get(i);
            if (used[vv]) continue;
            //c = 1 =>
            // побитовое и & == % 2
            if (colors[vv] == c || !dfs(vv, c ^ 1)) {
                return false;
            }
        }
        return true;
    }
}
