package pertemuan7;

public class TugasStukturListTest {
    public static void main(String[] args) {
        StukturList list = new StukturList();

        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(1);
        list.addFirst(9);

        System.out.println("List sebelum dihapus:");
        list.printList(); 

        // Hapus semua elemen
        list.clear();

        System.out.println("List setelah dihapus:");
        list.printList();
    }
}