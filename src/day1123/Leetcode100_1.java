package day1123;

//给定两个二叉树，编写一个函数来检验它们是否相同。
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
public class Leetcode100_1 {
    //采用递归思想
    /*class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null){
                return true;
            }
            if(p == null || q == null){
                return false;
            }
            if(p.val != q.val){
                return false;
            }
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }*/
}