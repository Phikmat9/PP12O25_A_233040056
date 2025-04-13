package pertemuan6;

public class Main {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);

        System.out.print("Sebelum remove: ");
        list.printList(); 

        list.removeMid(3); 

        System.out.print("Setelah remove: ");
        list.printList(); 
    }
}
