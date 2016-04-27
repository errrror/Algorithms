package Tree;

import java.util.ArrayList;

/**
 * Created by YGZ on 2016/4/22.
 * My email : errrrorer@foxmail.com
 */
//在这个类中都是针对二叉排序树进行的操作
public class InorderTreeWalk {
    //中序遍历
    public static void treewalk(TreeNode x){
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (x!=null){
            treewalk(x.left);
            res.add(x.val);
            treewalk(x.right);
        }
    }
    //查找值为K的节点 version 1
    public static TreeNode treeSearch1(TreeNode x,int k){
        if (x==null||k==x.val) return x;
        if (k<x.val){
            return treeSearch1(x.left,k);
        }else {
            return treeSearch1(x.right,k);
        }
    }
    //version 2
    public static TreeNode treeSearch2(TreeNode x,int k){
        while (x!=null||x.val!=k){
            if (k<x.val){
                x = x.left;
            }else {
                x = x.right;
            }
        }
        return x;
    }
    //找到值最小的节点
    public static TreeNode treeMinimun(TreeNode x){
        while (x.left!=null){
            x = x.left;
        }
        return x;
    }
    //找到值最大的节点
    public static TreeNode treeMaxmum(TreeNode x){
        while (x.right!=null){
            x = x.right;
        }
        return x;
    }
    //找到某个节点的后继
    public static TreeNode treesuccessor(TreeNode x){
        if (x!=null){
            return treeMinimun(x.right);
        }
        TreeNode y = x.parent;
        while(y!=null&&x==y.right){
            x = y;
            y = y.parent;
        }
        return y;
    }
    //差入一个点
    public static void treeInsert(TreeNode T,TreeNode z){
        TreeNode x = T;
        TreeNode y = null;
        while (x!=null){
            y = x;
            if (z.val<x.val){
                x = x.left;
            }else {
                x = x.right;
            }
        }
        z.parent = y;
        if (y==null){
            T = z;
        }else if (z.val<y.val){
            y.left = z;
        }else {
            y.right = z;
        }
    }

    public static void transPlant(TreeNode T,TreeNode u,TreeNode v){
        if (u.parent == null){
            T = v;
        }else if (u == u.parent.left){
            u.parent.left = v;
        }else {
            u.parent.right = v;
        }
        if (v!=null){
            v.parent = u.parent;
        }
    }
    public static void treeDelete(TreeNode T,TreeNode z){
        if (z.left==null){
            transPlant(T,z,z.right);
        }else if (z.right==null){
            transPlant(T,z,z.left);
        }else {
            TreeNode y = treeMinimun(z.right);
            if (y.parent!=z){
                transPlant(T,y,y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            transPlant(T,z,y);
            y.left = z.left;
            y.left.parent = y;
        }
    }
}
