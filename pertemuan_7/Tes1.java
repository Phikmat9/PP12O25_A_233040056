package pertemuan_7;

public class Tes1 {
    public static void main(String[] args) {
        ListMk list = new ListMk();

        Matakuliah mk1 = new Matakuliah("IF001", "Dasar Pemrograman", 4);
        Matakuliah mk2 = new Matakuliah("IF002", "Pemograman Web", 3);
        Matakuliah mk3 = new Matakuliah("IF005", "Struktur Distrik", 3);
        Matakuliah mk4 = new Matakuliah("IF004", "Konstruksi PL Beorientasi objek", 3);
       
        list.addHead(mk1);
        list.addHead(mk2);
        list.addHead(mk3);
        list.addHead(mk4);
        
        list.displayElement();
    }
}
