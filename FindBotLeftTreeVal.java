import java.util.LinkedList;
import java.util.Queue;

public class FindBotLeftTreeVal {

    // bfs
    public int findBottomLeftValue(TreeNode root) {
        int left = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return -1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> queue2 = new LinkedList<>();
            boolean isFirst = true;
            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                if (isFirst) {
                    left = current.val;
                    isFirst = !isFirst;
                }
                if (current.left != null) {
                    queue2.offer(current.left);
                }
                if (current.right != null) {
                    queue2.offer(current.right);
                }
            }
            queue = queue2;
        }
        return left;
    }

    public static void main(String[] args) {
        FindBotLeftTreeVal blt = new FindBotLeftTreeVal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = null;
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        System.out.println(blt.findBottomLeftValue(root));
    }
}
