package Date_19_12_20;

import java.util.*;

public class Graph {

    static ArrayList<Integer>[] graph;

    static int[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int parent = sc.nextInt() - 1;
            graph[i].add(parent);
            graph[parent].add(i);
        }
        used = new int[n];
        Arrays.fill(used, -1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == -1) {
                path = new Stack<>();
                set = new TreeSet<>();
                dfs(i, ans, -1);
                ans++;
            }
        }
        if (used[1] == used[4]) {

        }
        System.out.println(ans);
    }

    static Stack<Integer> path;
    static TreeSet<Integer> set;

    static void dfs(int v, int ch, int p) {
        used[v] = ch;
        path.add(v);
        for (int i = 0; i < graph[v].size(); i++) {
            int vv = graph[v].get(v);
            if (vv == p) continue;
            if (used[vv] != -1) {
                ArrayList<Integer> local_path = new ArrayList<>();
                int vp = path.pop();
                while (vp != vv) {
                    local_path.add(vp);
                    set.add(vp);
                    vp = path.pop();
                }
                for (int j = 0; j < local_path.size(); j++) {
                    path.add(local_path.get(local_path.size() - 1 - j));
                }
            }
            dfs(vv, ch, v);
        }
        path.pop();
    }


}
