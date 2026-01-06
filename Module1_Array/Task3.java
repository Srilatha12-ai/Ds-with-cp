class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);

        n1.next = n2;

        System.out.println(n1.data);       // 10
        System.out.println(n1.next.data);  // 20
    }
}
