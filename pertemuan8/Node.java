package pertemuan8;

public class Node {
    private Matakuliah data;
    private Node next;

    Node(Matakuliah data) {
        this.data = data;
        this.next = null;
    } 

    public void setData(Matakuliah data) { 
        this.data = data; 
    }

    public Matakuliah getData() { 
        return data; 
    }

    public void setNext(Node next) { 
        this.next = next; 
    }

    public Node getNext() { 
        return next; 
    }
}
