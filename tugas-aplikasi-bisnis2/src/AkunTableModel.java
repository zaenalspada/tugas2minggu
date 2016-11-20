import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AkunTableModel extends AbstractTableModel{

    List<Akun> daftarAkun = new ArrayList<>();
    String[] kolom = {"Username","Nama","Password","Status"};
    
    public AkunTableModel(List<Akun> daftarAkun){
        this.daftarAkun = daftarAkun;
    }

    
    
    public int getRowCount() {
      return daftarAkun.size();    
    }


    
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0: return daftarAkun.get(rowIndex).getUsername();
           case 1: return daftarAkun.get(rowIndex).getNama();
           case 2: return daftarAkun.get(rowIndex).getPassword();
           case 3: return daftarAkun.get(rowIndex).getStatus();
           default : return null;
           
       } 
    }

    @Override
    public int getColumnCount() {
        return kolom.length; }

    


   
    
}