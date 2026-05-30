/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//this code is skipping the helper function
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
//with helper
// //class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         return check(p, q);
//     }

//     public boolean check(TreeNode p, TreeNode q) {

//         if (p == null && q == null) {
//             return true;
//         }

//         if (p == null || q == null) {
//             return false;
//         }

//         if (p.val != q.val) {
//             return false;
//         }

//         return check(p.left, q.left) && check(p.right, q.right);
//     }
// }

