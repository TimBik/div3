package Date_3_04_21;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//поиск кратчайшего расстояний до вершины
//поиск кратчайшего цикла
//(в неориентированном незвешанном графе)
// bfs на плоскости
//Найти все рёбра/вершины, лежащие на каком-либо кратчайшем пути между заданной парой вершин (a,b).
public class BFS {

    static ArrayList<Integer>[] graph;
    static char ch[][];
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        graph = new ArrayList[n];
//        for (int i = 0; i < n; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        for (int i = 0; i < m; i++) {
//            int x = sc.nextInt() - 1;
//            int y = sc.nextInt() - 1;
//            graph[x].add(y);
//            graph[y].add(x);
//        }
//        bfs(0);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int max = Math.max(a, b) + 1;
//        graph = new ArrayList[max * 2 + 1];
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        for (int i = 1; i < graph.length; i++) {
//            graph[i].add(i - 1);
//            if (i * 2 < graph.length - 1) {
//                graph[i].add(i * 2);
//            }
//        }
//        int[] ways = bfsShortWay(a);
//        System.out.println(ways[b]);
//        int minCycle = Integer.MAX_VALUE;
//        for (int i = 0; i < graph.length; i++) {
//            int minNowCycle = bfsShortCycle(i);
//            minCycle = Math.min(minNowCycle, minCycle);
//        }
//        if (minCycle == Integer.MAX_VALUE) {
//            System.out.println();
//        } else {
//            System.out.println(minCycle);
//
//       }
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList[n * m];
        for (int i = 0; i < n * m; i++) {
            graph[i] = new ArrayList<>();
        }
        ch = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                ch[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ch[i][j] != '#') {
                    if (i + 1 < n && ch[i + 1][j] != '#') {
                        graph[i * m + j].add((i + 1) * m + j);
                    }
                    if (i - 1 >= 0 && ch[i - 1][j] != '#') {
                        graph[i * m + j].add((i - 1) * m + j);
                    }
                    if (j + 1 < m && ch[i][j + 1] != '#') {
                        graph[i * m + j].add((i) * m + j + 1);
                    }
                    if (j - 1 >= 0 && ch[i][j - 1] != '#') {
                        graph[i * m + j].add((i) * m + j - 1);
                    }
                }
            }
        }
        ArrayList<Character> ans = new ArrayList<>();
        int minAns = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ch[i][j] != '.' && ch[i][j] != '#') {
                    int min = bfsFindMinPath(i * m + j);
                    if (minAns > min) {
                        ans.clear();
                        minAns = min;
                    }
                    if (min == minAns) {
                        ans.add(ch[i][j]);
                    }
                }
            }
        }
        for (char ansCh : ans) {
            System.out.println(ansCh);
        }
    }

    private static int bfsFindMinPath(int v) {
        ArrayList<Integer> queue = new ArrayList<>();
        int id = 0;
        queue.add(v);
        int[] ways = new int[graph.length];
        Arrays.fill(ways, -1);
        ways[v] = 0;
        while (id < queue.size()) {
            int vv = queue.get(id++);
            for (int x : graph[vv]) {
                int i = x / m;
                int j = x % m;
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    return ways[vv] + 1;
                }
                if (ways[x] == -1) {
                    ways[x] = ways[vv] + 1;
                    queue.add(x);
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int bfsShortCycle(int v) {
        ArrayList<Integer> queue = new ArrayList<>();
        int id = 0;
        queue.add(v);
        int[] ways = new int[graph.length];
        Arrays.fill(ways, -1);
        ways[v] = 0;
        while (id < queue.size()) {
            int vv = queue.get(id++);
            for (int x : graph[vv]) {
                if (ways[x] == -1) {
                    ways[x] = ways[vv] + 1;
                    queue.add(x);
                } else {
                    return ways[vv] + ways[x] + 1;
                }
            }
        }
        return Integer.MAX_VALUE;
    }


    private static int[] bfsShortWay(int v) {
        ArrayList<Integer> queue = new ArrayList<>();
        int id = 0;
        queue.add(v);
        int[] ways = new int[graph.length];
        Arrays.fill(ways, -1);
        ways[v] = 0;
        while (id < queue.size()) {
            int vv = queue.get(id++);
            for (int x : graph[vv]) {
                if (ways[x] == -1) {
                    ways[x] = ways[vv] + 1;
                    queue.add(x);
                }
            }
        }
        return ways;
    }

    private static void bfs(int v) {
        ArrayList<Integer> queue = new ArrayList<>();
        int id = 0;
        queue.add(v);
        boolean[] used = new boolean[graph.length];
        used[v] = true;
        while (id < queue.size()) {
            int vv = queue.get(id++);
            System.out.println(vv);
            for (int x : graph[vv]) {
                if (!used[x]) {
                    used[x] = true;
                    queue.add(x);
                }
            }
        }
    }


}
