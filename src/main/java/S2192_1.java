import java.util.*;

public class S2192_1 {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        Set<Integer>[] anc = new Set[n];
        for (int i = 0; i < n; i++) {
            anc[i] = new HashSet<>();
        }
        List<Integer>[] e = new List[n];
        for (int i = 0; i < n; i++) {
            e[i] = new ArrayList<>();
        }
        int[] indeg = new int[n];
        for (int[] edge : edges) {
            e[edge[0]].add(edge[1]);
            ++indeg[edge[1]];
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : e[u]) {
                anc[v].add(u);
                for (int i : anc[u]) {
                    anc[v].add(i);
                }
                --indeg[v];
                if (indeg[v] == 0) {
                    q.offer(v);
                }
            }
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
            for (int j : anc[i]) {
                res.get(i).add(j);
            }
            Collections.sort(res.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        S2192_1 s = new S2192_1();
        int[][] edges = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        List<List<Integer>> ancestors = s.getAncestors(8, edges);
        for(List<Integer> l:ancestors){
            System.out.println(l.toString());
        }
        int[][] edges2 = {{0,1},{0,2},{0,3},{0,4},{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
        List<List<Integer>> ancestors2 = s.getAncestors(5, edges2);
        for(List<Integer> l:ancestors2){
            System.out.println(l.toString());
        }
    }
}
