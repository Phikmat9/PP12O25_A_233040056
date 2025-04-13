package pertemuan5;

public class Main {
    public static void main(String[] args) {
       StrukturList list = new StrukturList();

        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);

        System.out.print("Sebelum removeHead: ");
        list.printList(); 

        list.removeHead(); 

        System.out.print("Setelah removeHead: ");
        list.printList(); 
    }
}
