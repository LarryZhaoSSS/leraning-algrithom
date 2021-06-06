public class Main {
    public ListNode removeElements(ListNode head, int val, int depth) {
        String depthString = generateDepthString(depth);
        System.out.println(depthString);
        System.out.print("Call: remove " + val + "  in  " + head);
        if (head == null) {
            System.out.print(depthString);
            System.out.println("Return:" + head);
            return head;
        }
        ListNode res = removeElements(head.next, val, depth+1);
        System.out.print(depthString);
        System.out.println("AFTER REMOVE " + val + ":  " + res);
        ListNode ret;
        if (head.val == val) {
            ret = res;
        } else {
            head.next = res;
            return head;
        }
        System.out.print(depthString);
        System.out.println("RETURN:  " + ret);
        return ret;
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 6, 2};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode res = (new Main()).removeElements(head, 6, 0);
        System.out.println(res);
    }
}
