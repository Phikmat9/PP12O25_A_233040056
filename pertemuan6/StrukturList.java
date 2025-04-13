package pertemuan6;

public class StrukturList {
    private Node HEAD;

    // Tambah node di awal list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    // REMOVE HEAD
    public void removeHead() {
        if (HEAD != null) {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    // REMOVE TAIL
    public void removeTail() {
        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                Node preNode = null;
                Node lastNode = HEAD;

                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    // REMOVE MIDDLE
    public void removeMid(int e) {
        Node preNode = new Node(0); // dummy node
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = null; // elemen pertama
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    // Method bantu hapus node
    public void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    // Cek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Cetak isi list
    public void printList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
