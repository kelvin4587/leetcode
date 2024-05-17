package com.kelvin;

import java.util.*;

public class S2385 {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        dfs(graph, root);
        Queue<int[]> queue = new ArrayDeque<int[]>();
        queue.offer(new int[]{start, 0});
        Set<Integer> visited = new HashSet<Integer>();
        visited.add(start);
        int time = 0;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int nodeVal = arr[0];
            time = arr[1];
            for (int childVal : graph.get(nodeVal)) {
                if (visited.add(childVal)) {
                    queue.offer(new int[]{childVal, time + 1});
                }
            }
        }
        return time;
    }

    public void dfs(Map<Integer, List<Integer>> graph, TreeNode node) {
        graph.putIfAbsent(node.val, new ArrayList<>());
        for (TreeNode child : Arrays.asList(node.left, node.right)) {
            if (child != null) {
                graph.get(node.val).add(child.val);
                graph.putIfAbsent(child.val, new ArrayList<Integer>());
                graph.get(child.val).add(node.val);
                dfs(graph, child);
            }
        }
    }

    public static void main(String[] args) {
        S2385 s = new S2385();
        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(3);
//        root.left = new TreeNode(5);
//        root.left.right = new TreeNode(4);
//        root.left.right.left = new TreeNode(9);
//        root.left.right.right = new TreeNode(2);
//        root.right.right = new TreeNode(10);
//        root.right.left = new TreeNode(6);

        System.out.println(s.amountOfTime(root,1));
    }
}
