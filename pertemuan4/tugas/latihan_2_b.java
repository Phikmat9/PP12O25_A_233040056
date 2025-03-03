package tugas;

public class latihan_2_b {
    public static void main(String[] args) {
        StrukturList List = new StrukturList();
        List.addHead(3.4);
        List.addMid(2.1, 2);
        List.addMid(1.1, 3);
        List.addMid(4.5, 4);
        List.addTail(5.5);
        System.out.print("deret b; ");
        List.displayElement();
    }
}
