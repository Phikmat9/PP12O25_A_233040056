package tugas_pertemusn3;

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
