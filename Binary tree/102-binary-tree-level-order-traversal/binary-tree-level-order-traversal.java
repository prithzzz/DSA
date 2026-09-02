// Approach: [BFS]
// Form a queue and keep adding and polling the nodes to it until queue is empty. 
// for loop - For each level calculate the current queue size and poll n add those nodes to the level array while adding new nodes(left and right child of current node).
// while loop - Add each level to result array(2D) and return it.


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                if(node != null){
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            if(level.size() > 0)
                result.add(level);
        }
    
        return result;
    }
}