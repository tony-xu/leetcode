import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(
                2,
                new ListNode(
                        4,
                        new ListNode(3)
                )
        );

        ListNode l2 = new ListNode(
                5,
                new ListNode(
                        6,
                        new ListNode(4)
                )
        );
        Main mainInstance = new Main();
        ListNode res = mainInstance.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode current = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry > 0) {
            int l1val = l1 != null ? l1.val : 0;
            int l2val = l2 != null ? l2.val : 0;
            int sum = l1val + l2val + carry;
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }



/*        for (int i = 1; i <= 100; i++) {
            current.next = getNext(l1, l2, current.next);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 == null && l2 == null) {
                break;
            }
        }*/

        return res.next;
    }

    public ListNode getNext(ListNode l1, ListNode l2, ListNode current) {
        int l1val = l1 != null ? l1.val : 0;
        int l2val = l2 != null ? l2.val : 0;
        int currentVal = current != null ? current.val : 0;
        int sum = l1val + l2val + currentVal;
        ListNode newNode = new ListNode(sum % 10);
        if (sum >= 10) {
            newNode.next = new ListNode(1);
        }
        return newNode;
    }
}