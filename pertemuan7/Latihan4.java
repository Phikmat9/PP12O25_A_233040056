package pertemuan7;

public class Latihan4 {
    public static void main(String[] args) {

        StukturList list = new StukturList();
        list.addTail(7);
        list.addTail(6);
        list.addTail(4);
        list.addTail(2);
        list.addTail(3);
        list.printList();                  
        System.out.println(list.size());
    }
}
