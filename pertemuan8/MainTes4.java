package pertemuan8;


//Tes-4
public class MainTes4 {
     public static void main(String[] args) {
        Struktur list = new Struktur();

        Matakuliah mk1 = new Matakuliah("IF001", "Dasar Pemrograman", 4);
        Matakuliah mk2 = new Matakuliah("IF002", "Pemograman Web", 3);
        Matakuliah mk3 = new Matakuliah("IF005", "Struktur Distrik", 3);
        Matakuliah mk4 = new Matakuliah("IF004", "Konstruksi PL Beorientasi objek", 3);
       
        list.addTail(mk1);
        list.addMid(mk2, 2);
        list.addMid(mk3, 3);
        list.addHead(mk4);
        
        list.displayElement();
    }
}
