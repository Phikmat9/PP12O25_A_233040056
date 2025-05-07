package pertemuan8;

//latihan 1
public class Matakuliah {
    private String kode;
    private String nama;
    private int sks; 

    public Matakuliah (String kode, String nama, int sks){
        super();
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void setkode(String kode) { 
        this.kode = kode; 
    }

    public String getkode (){
        return kode;
    }

    public void setnama(String nama) { 
        this.nama = nama; 
    }

    public String getnama (){
        return nama;
    }

    public void setsks(int sks) { 
        this.sks = sks; 
    }
    public int getsks(){
        return sks;
    }
}