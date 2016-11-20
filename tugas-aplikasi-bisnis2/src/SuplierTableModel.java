import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class SuplierTableModel extends AbstractTableModel{

    List<Suplier> daftarSuplier = new ArrayList<>();
    String[] kolom = {"Kode","Nama","Alamat","Notlpn"};
    
    public SuplierTableModel(List<Suplier> daftarSuplier){
        this.daftarSuplier = daftarSuplier;
    }

    
    
    public int getRowCount() {
      return daftarSuplier.size();    
    }


    
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0: return daftarSuplier.get(rowIndex).getKode();
           case 1: return daftarSuplier.get(rowIndex).getNama();
           case 2: return daftarSuplier.get(rowIndex).getAlamat();
           case 3: return daftarSuplier.get(rowIndex).getNotlpn();
           default : return null;
           
       } 
    }

    @Override
    public int getColumnCount() {
        return kolom.length; }

    


   
    
}