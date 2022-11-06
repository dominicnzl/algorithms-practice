public class Algorithms {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        Node first = new Node(3);
        Node second = new Node(4);
        Node third = new Node(6);
        Node fourth = new Node(9);

        linkedList.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        linkedList.displayContents();
    }
}
