package Tree;

import java.util.ArrayList;

/**
 * Created by YGZ on 2016/4/22.
 * My email : errrrorer@foxmail.com
 */
public class InorderTreeWalk {
    //针对二叉排序树的中序遍历
    public static void treewalk(TreeNode x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (x!=null){
            treewalk(x.left);
            res.add(x.val);
            treewalk(x.right);
        }
    }
    //在二叉排序树中查找值为K的节点
    public static TreeNode treeSearch(TreeNode x,int k){
        if (x==null||k==x.val) return x;
        if (k<x.val){
            return treeSearch(x.left,k);
        }else {
            return treeSearch(x.right,k);
        }
    }
}
