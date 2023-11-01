package com.kelvin;

import java.util.ArrayList;
import java.util.List;

public class S235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return null;
    }
    public List<TreeNode> getPath(TreeNode root, TreeNode target){
        List<TreeNode> path = new ArrayList<>();
        TreeNode node = root;
        while(node.val!=target.val){
            if(node.val<target.val){
                path.add(node);
                node=node.right;
            }else if(node.val>target.val){
                path.add(node);
                node=node.left;
            }
        }
        path.add(node);
        return path;
    }
}
