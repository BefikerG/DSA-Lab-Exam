public class Number1 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current!= null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }

        ListNode temp = head;
        while (temp!= null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Number1 number1Obj = new Number1();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Input:");
        number1Obj.printList(head);

        ListNode reversedHead = number1Obj.reverseList(head);

        System.out.println("Output:");
        number1Obj.printList(reversedHead);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}