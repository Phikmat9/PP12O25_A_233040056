package pertemuan8;

public class Struktur {
    private Node HEAD;
    public Struktur() {
        HEAD = null;
    }
    public boolean isEmpty() {
        return HEAD == null;
    }


    // latihan 2
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        }
        else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }    
    }

    //latihan 3
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List kosong");
        }
        else{
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.print("Matakuliah: " + mk.getkode());
                System.out.print(" : " + mk.getnama());
                System.out.print(" : " + mk.getsks());
                System.out.println();
                curNode = curNode.getNext();
            }
        }
    }



      // Tes-2 Add Tail
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

     // Tes-3 Add mid
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
}
