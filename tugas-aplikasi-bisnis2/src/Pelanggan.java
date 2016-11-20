public class Pelanggan {
 private String kode;
 private String nama;
 private String alamat;
 private int notlpn;

    public Pelanggan(String kode, String nama, String alamat, int notlpn) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.notlpn = notlpn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
     public int getNotlpn() {
        return notlpn;
    }

    public void setNotlpn(int notlpn) {
        this.notlpn = notlpn;
    }

    

    public Pelanggan() {
    }

 
    
   
 
}