package pertemuan7;

public class ListMk {
    private Node HEAD;

    public ListMk() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    //addHead
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // Add Tail
    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) { 
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

     // Add middle
     public void addMid(Matakuliah data, int position) {
        Node newNode = new Node(data);
    
        if (position <= 1 || HEAD == null) { // Jika posisi di awal atau list kosong
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            int i = 1;
            
            while (curNode.getNext() != null && i < position - 1) {
                curNode = curNode.getNext();
                i++;
            }
            
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List kosong");
        }
        else{
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.print("Matakuliah: " + mk.getKode());
                System.out.print(" : " + mk.getNama());
                System.out.print(" : " + mk.getSks());
                System.out.println();
                curNode = curNode.getNext();
            }
        }
    }
    
}
