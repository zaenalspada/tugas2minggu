import java.util.ArrayList;
import  java.util.List;
import javax.swing.table.AbstractTableModel;


public class BarangTableModel extends AbstractTableModel{

    List<Barang> daftarBarang = new ArrayList<>();
    String[] kolom = {"Kode","Nama Barang","Harga"};
    
    public BarangTableModel(List<Barang> daftarBarang){
        this.daftarBarang = daftarBarang;
    }

    
    
    public int getRowCount() {
      return daftarBarang.size();    
    }


    
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0: return daftarBarang.get(rowIndex).getKode();
           case 1: return daftarBarang.get(rowIndex).getNama();
           case 2: return daftarBarang.get(rowIndex).getHarga();
           default : return null;
           
       } 
    }

    @Override
    public int getColumnCount() {
        return kolom.length; }

    


   
    
}
