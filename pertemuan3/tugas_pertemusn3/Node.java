package tugas_pertemusn3;
public class Node {
    private int data;
    private Node next;

    // inisialisasi atribut node 

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // setter & getter
    public void setData(int data) { 
        this.data = data; 
    }
    public int getData() { 
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

