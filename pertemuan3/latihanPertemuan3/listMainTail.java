package latihanPertemuan3;

public class listMainTail {
    public static void main(String[] args) {
        StrukturList List = new StrukturList();
        List.addTail(1);
        List.addTail(4);
        List.addTail(5);
        List.addTail(7);

        System.out.println("Element; ");
        List.displayElement();
    }
}
