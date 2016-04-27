package Tree;

/**
 * Created by YGZ on 2016/4/26.
 * My email : errrrorer@foxmail.com
 */
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
