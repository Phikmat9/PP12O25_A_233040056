package pertemuan9;

public class StrukturQueue {
    //latihan 2a
    private Node front;
    private Node rear;

    public StrukturQueue() {
        front = null;
        rear = null;
    }

      // latihan 2b Operasi isEmpty 
    public boolean isEmpty() {
        return front == null;
    }

    //latihan 1
    public void enqueue (int data){
        Node newNode = new Node (data);
        if (isEmpty()) {
            front = newNode;
            rear= newNode;
        }
        else{
            rear.setNext (newNode);
            rear = newNode;
        }
    }


    //latihan 3
    public int size(){
        int Size = 0;
        Node curNode = front;
        while (curNode != null) {
            Size++;
            curNode = curNode.getNext();
        }
        return Size;
    }

    public int front() {
        return front != null ? front.getData() : -1;
    }

    
     // Operasi displayElements
    public void displayElements() {
        if (!isEmpty()) {
            Node current = front;
            System.out.print("Elemen queue: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("Queue kosong!");
        }
    }

    //tugas
    public int dequeue() {
        if (!isEmpty()) {
            int value = front.data;
            front = front.next;
            if (front == null) rear = null;
            return value;
        } else {
            System.out.println("Queue kosong!");
            return -1;
        }
    }

    
}
