package latihanPertemuan3;

public class listMainHead {
    public static void main(String[] args) {
        StrukturList List = new StrukturList();
        List.addHead(7);
        List.addHead(5);
        List.addHead(4);
        List.addHead(1);

        System.out.println("Element; ");
        List.displayElement();
    }
}
