package tugas;

public class latihan_2_b {
    public static void main(String[] args) {
        StrukturList List = new StrukturList();
        List.addTail(4);
        List.addTail(2);
        List.addTail(4);
        List.addTail(5);
        List.addTail(5);
        List.addTail(5);
        List.addMid(1,3);
        List.addMid(1,3);
        List.addMid(1,3);
        List.addHead(3);
        System.out.println("Element; ");
        List.displayElement();
    }
}
