package pertemuan_7;

public class Node {
    private Matakuliah data;
    private Node next;

    // inisialisasi atribut node 
    public Node(Matakuliah data) {
        this.data = data;
        this.next = null;
    }

    // setter & getter
    public void setData(Matakuliah data) { 
        this.data = data; 
    }
    public Matakuliah getData() { 
        return data; 
    }

     // Setter & Getter untuk next
     public void setNext(Node next) { 
        this.next = next; 
    }
    public Node getNext() { 
        return next; 
    }
}