public class Stack {
    Node top;
    private Node temp;

    public void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;

    }

    public void clear() {
        top = null;
    }

    public void printStack() {
        Node temp = top;

        while (temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
