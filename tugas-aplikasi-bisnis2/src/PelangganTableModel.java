import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PelangganTableModel extends AbstractTableModel{

    List<Pelanggan> daftarPelanggan = new ArrayList<>();
    String[] kolom = {"Kode","Nama","Alamat","Notlpn"};
    
    public PelangganTableModel(List<Pelanggan> daftarPelanggan){
        this.daftarPelanggan = daftarPelanggan;
    }

    
    
    public int getRowCount() {
      return daftarPelanggan.size();    
    }


    
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0: return daftarPelanggan.get(rowIndex).getKode();
           case 1: return daftarPelanggan.get(rowIndex).getNama();
           case 2: return daftarPelanggan.get(rowIndex).getAlamat();
           case 3: return daftarPelanggan.get(rowIndex).getNotlpn();
           default : return null;
           
       } 
    }

    @Override
    public int getColumnCount() {
        return kolom.length; }

    


   
    
}