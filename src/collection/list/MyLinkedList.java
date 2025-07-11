package collection.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;  // 첫 노드의 위치
    private int size = 0;  // 자료 구조에 입력된 데이터의 사이즈

    // 새로운 노드를 만들어서 마지막 노드에 연결
    @Override
    public void add(E e) {
        Node<E> newNode = new Node(e);  // 새로운 노드 만들기
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();  // 마지막 노드의 위치를 찾아서
            lastNode.next = newNode;  // next에 새로운 노드의 위치를 대입
        }

        size++;
    }


    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }

        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
    }

    // 특정 위치의 노드를 찾아서 안의 데이터를 변경
    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;

        return oldValue;
    }

    // 중간 위치의 데이터를 삭제하는 메서드
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);  // 삭제하고 싶은 노드
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }

        // 삭제할 노드를 초기화
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    // 특정 위치에 있는 노드의 데이터를 반환
    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;
    }

    // 몇 번째 인덱스에 있는지 찾아서 반환
    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }

            index++;
        }

        // 없으면 -1 반환
        return -1;
    }

    @Override
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

    // Node 클래스를 제네릭 타입으로 선언
    private static class Node<E> {

        E item;  // Integer로 들어올지, String으로 들어올지 모르겠다!
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A -> B -> C] 형식으로 출력하고 싶다.
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append(" -> ");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
