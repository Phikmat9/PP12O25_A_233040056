package latihanPertemuan3;

public class Main {
    public static void main(String[] args) {
        //membuat nod
        Node node1 = new Node(9);
        Node node2 = new Node(25);
        Node node3 = new Node(24);

        //menggunakan setter
        node1.setNext(node2);
        node2.setNext(node3);

        //menggunakan gett
        System.out.println("Isi setter node : ");
        Node p = node1;
        while(p != null)
        {
            System.out.print(p.getData()+ "");
            p = p.getNext();
        }
        System.out.println();
    }

}
