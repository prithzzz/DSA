// Approach:
// Iterate through every level in the tree and add node to the queue. 
// Then again iterate within every level and add value of each polled node from queue to the sum. Add the left n right child of the node to the queue(adding next level elements to the queue).
// Move to next level until null nodes are reached.


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
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<Double> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int n = queue.size();
            double sum = 0;
            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }

            result.add(sum / n);
        }

        return result;
    }
}