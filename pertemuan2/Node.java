package pertemuan2;
public class Node {
    private int nilai;
    private Node next;

    // inisialisasi node
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null; 
    }

    // Setter & Getter untuk nilai
    public void setNilai(int nilai) { 
        this.nilai = nilai; 
    }
    public int getNilai() { 
        return nilai; 
    }

    // Setter & Getter untuk next
    public void setNext(Node next) { 
        this.next = next; 
    }
    public Node getNext() { 
        return next; 
    }
}
