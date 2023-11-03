package com.kelvin;

import java.util.ArrayList;
import java.util.List;

public class S235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return null;
    }

    public static void main(String[] args) {
        Integer[] data = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode root = new TreeNode();
        root.val = data[0];
        int count = 0;
        int length = power(2, count);
        int i = 1;
        while (i < length) {

        }

    }

    public static int power(int base, int times) {
        int result = base;
        for (int i = 0; i < times; i++) {
            if (i == 0) {
                result = 1;
            } else {
                result = result * base;
            }
        }
        return result;
    }

    public List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<>();
        TreeNode node = root;
        while (node.val != target.val) {
            if (node.val < target.val) {
                path.add(node);
                node = node.right;
            } else if (node.val > target.val) {
                path.add(node);
                node = node.left;
            }
        }
        path.add(node);
        return path;
    }
}
