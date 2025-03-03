package latihan;

public class StrukturList {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Add Tail
    public void addTail(int data) {
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

    // Add Head
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // Add middle
    public void addMid(int data, int position) {
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
        
    // Display
    public void displayElement() { 
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println(); 
    }
  
}

