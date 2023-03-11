public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return buildTree(head, null);
    }

    private TreeNode buildTree(ListNode start, ListNode end) {
        if (start == end) {
            return null;
        }
        ListNode mid = findMid(start, end);
        TreeNode root = new TreeNode(mid.val);
        root.left = buildTree(start, mid);
        root.right = buildTree(mid.next, end);
        return root;
    }

    private ListNode findMid(ListNode start, ListNode end) {
        ListNode slow = start;
        ListNode fast = start;
        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(){
        
    }
}
