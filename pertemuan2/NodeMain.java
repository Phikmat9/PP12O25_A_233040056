package pertemuan2;
public class NodeMain {
    public static void main (String[ ]args) {

        //membuat 2 buah node  n1 & n2
        Node n1 = new  Node (2);
        Node n2 = new Node (3);
        Node n3 = new Node (5);
        Node n4 = new Node (7);
        Node n5 = new Node (9);
    
        //membuat relasi node n1 &n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        //menampilkan Node n1 & n2 dengan pointer p
        System.out.println("Isi Linked List: ");
        Node p = n1;
        while(p != null)
        {
            System.out.print(p.getNilai()+ "");
            p = p.getNext();
        }
        System.out.println();
    }

}
