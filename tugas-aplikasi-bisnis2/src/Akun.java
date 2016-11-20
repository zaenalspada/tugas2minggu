public class Akun {
 private String username;
 private String nama;
 private int password;
  private String status;

    public Akun(String username, String nama, int password, String status) {
        this.username = username;
        this.nama = nama;
        this.password = password;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Akun() {
    }
}