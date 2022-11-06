public class CustomLinkedList {

    Node head;

    public void displayContents() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteKthFromEnd(int k) {
        if (head == null || k == 0) {
            return;
        }
        Node first = head;
        Node second = head;

        // move second pointer to position k
        for (int i = 0; i < k; i++) {
            second = second.next;
            if (second.next == null) {
                // k >= list.length
                if (i == k - 1) {
                    head = head.next;
                }
                return;
            }
        }

        // move both pointers at same pace until second reaches end
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        // point the first.next to skip the next node
        first.next = first.next.next;
    }
}
