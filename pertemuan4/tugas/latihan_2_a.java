package tugas;

public class latihan_2_a {
    public static void main(String[] args) {
        StrukturList List = new StrukturList();
        List.addTail(1);
        List.addTail(3);
        List.addTail(5);
        List.addMid(4,3);
        List.addMid(4,3);
        List.addHead(2);
        System.out.println("Element; ");
        List.displayElement();
    }
}
