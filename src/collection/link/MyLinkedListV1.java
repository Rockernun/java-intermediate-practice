package collection.link;

public class MyLinkedListV1 {

    private Node first;  // 첫 노드의 위치
    private int size = 0;  // 자료 구조에 입력된 데이터의 사이즈

    // 새로운 노드를 만들어서 마지막 노드에 연결
    public void add(Object e) {
        Node newNode = new Node(e);  // 새로운 노드 만들기
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();  // 마지막 노드의 위치를 찾아서
            lastNode.next = newNode;  // next에 새로운 노드의 위치를 대입
        }

        size++;
    }


    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    // 특정 위치의 노드를 찾아서 안의 데이터를 변경
    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;

        return oldValue;
    }

    // 특정 위치에 있는 노드의 데이터를 반환
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    // 몇 번째 인덱스에 있는지 찾아서 반환
    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }

            index++;
        }

        // 없으면 -1 반환
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
