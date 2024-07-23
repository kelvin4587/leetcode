package com.kelvin;


import java.util.*;

public class S2101 {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        Map<Integer, List<Integer>> edges = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i !=j && isConnected(bombs,i,j)){
                    edges.putIfAbsent(i,new ArrayList<Integer>());
                    edges.get(i).add(j);
                }
            }
        }
        int res = 0;
        for(int i=0;i<n;i++){
            boolean[] visited = new boolean[n];
            int cnt = 1;
            Queue<Integer> queue = new ArrayDeque<Integer>();
            queue.offer(i);
            visited[i] = true;
            while(!queue.isEmpty()){
                int cidx = queue.poll();
                for(int nidx: edges.getOrDefault(cidx,new ArrayList<Integer>())){
                    if(visited[nidx]){
                        continue;
                    }
                    ++cnt;
                    queue.offer(nidx);
                    visited[nidx] = true;
                }
            }
            res = Math.max(res,cnt);
        }
        return res;
    }
    public boolean isConnected(int[][] bombs, int u,int v) {
        long dx = bombs[u][0] - bombs[v][0];
        long dy = bombs[u][1] - bombs[v][1];
        return (long) bombs[u][2]*bombs[u][2] >= dx*dx+dy*dy;
    }
    public static void main(String[] args) {
        S2101 s2101 = new S2101();
        System.out.println(s2101.maximumDetonation(new int[][]{{2,1,3},{6,1,4}}));
    }
}
