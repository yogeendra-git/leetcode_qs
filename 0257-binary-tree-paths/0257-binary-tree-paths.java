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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root!=null){
            dfs(root,"",res);
        }
        return res;
        
    }
    private void dfs(TreeNode node,String path,List<String> res){
        if(node.left==null && node.right==null){
            res.add(path+node.val);
        }
        else{
            if(node.left!=null){
                dfs(node.left,path+node.val+"->",res);
            }
            if(node.right!=null){
                dfs(node.right,path+node.val+"->",res);
            }
        }
    }
}