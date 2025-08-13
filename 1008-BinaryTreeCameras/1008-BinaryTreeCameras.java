// Last updated: 8/13/2025, 2:41:56 PM
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
class Solution {
    int Camera = 0;
    public int minCameraCover(TreeNode root) {
        int c = minCamera(root);
        if(c == -1){
            Camera++;
        }
        return Camera;
    }
    public int minCamera(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = minCamera(root.left);
        int right = minCamera(root.right);
        if(left == -1 || right == -1){//id node p camera ki need h 
            Camera++;
            return 1;//Camera setup kra h 
        }
        if(left == 1 || right == 1){//inme s koi ek k pass ya dono k pass camera h or ek k pass camera h or dusra wala covered h 
            return 0;//iska mtlb m covered hu
        }
        else{
            return -1;//need camera 
        }
    }
}