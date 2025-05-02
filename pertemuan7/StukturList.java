package pertemuan7;

public class StukturList {
    private Node head;

    public void addTail(int Data) {
        Node newNode = new Node(Data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("List Kosong");
            return;
        }
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    //latihan 1
    public boolean find(int key) {
        Node current = head;
        while (current != null) {
            if (current.getData() == key) return true;
            current = current.getNext();
        }
        return false;
    }

    //Latihan 3
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void clear() {
        head = null;
    }
}