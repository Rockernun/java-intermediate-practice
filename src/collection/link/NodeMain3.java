package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {

        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("연결된 노드 출력하기");
        printAll(first);

        // 마지막 노드 반환하기
        Node lastNode = getLastNode(first);
        System.out.println(lastNode);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        // 데이터 추가하기
        System.out.println("=== 데이터 추가하기 ===");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    // 마지막 노드 반환 메서드 구현
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    // 모든 노드를 탐색하는 메서드 구현
    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    // 특정 인덱스의 노드를 조회하는 메서드 구현
    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    // 특정 데이터를 추가하는 메서드 구현
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}

/*
[A -> B -> C]
연결된 노드 출력하기
A
B
C
[C]
index2Node = C
=== 데이터 추가하기 ===
[A -> B -> C -> D]
[A -> B -> C -> D -> E]
[A -> B -> C -> D -> E -> F]
*/