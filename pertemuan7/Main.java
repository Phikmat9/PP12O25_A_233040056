package pertemuan7;

public class Main {
    public static void main(String[] args) {
        ListMk list = new ListMk();

        Matakuliah mk1 = new Matakuliah("IF001", "Dasar Pemrograman", 4);
        Matakuliah mk2 = new Matakuliah("IF002", "Pemograman Web", 3);

        list.addHead(mk1);
        list.addHead(mk2);
        list.displayElement();
    }
}
