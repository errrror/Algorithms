package Tree;

/**
 * Created by YGZ on 2016/4/26.
 * My email : errrrorer@foxmail.com
 */

/*
* 红黑树是一棵二叉搜索树，它在每个节点上增加了一个存储位来表示节点的颜色，可以是RED或BLACK。
* 红黑树的性质：
* 1、每个节点或者是红色的，或者是黑色的。
* 2、根节点是黑色的。
* 3、每个叶节点（NIL）是黑色的。
* 4、如果一个节点是红色的，则它的两个子节点都是黑色的。
* 5、对每个节点，从该节点到其所有后代叶节点的简单路径上，均包含相同数目的黑色节点。*/
public class RedBlackTree {
    public static void leftRotate(TreeNode T,TreeNode x){
        TreeNode y = x.right;
        x.right = y.left;
        if (y.left!=null){
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == T){
            T = y;
        }else if (x == x.parent.left){
            x.parent.left = y;
        }else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }
    public static void rightRotate(TreeNode T,TreeNode x){
        TreeNode y = x.parent;
        y.left = x.right;
        if (x.right!=null){
            x.right.parent = y;
        }
        if (T==y){
            x = T;
        }else if (y == y.parent.left){
            y.parent.left = x;
        }else {
            y.parent.right = x;
        }
        x.parent = y.parent;
        x.right = y;
    }
}
