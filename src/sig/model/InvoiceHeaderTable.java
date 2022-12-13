
package sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import sig.view.invoiceFrame;


public class InvoiceHeaderTable extends AbstractTableModel {

    private ArrayList<invoiceHeader> invoicesArray;
    private String[] colmns = {"Invoice Number", "Invoice Date", "Customer Name", "Invoice Total"};
    
    public InvoiceHeaderTable(ArrayList<invoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    @Override
    public int getRowCount() {
        return invoicesArray.size();
    }

    @Override
    public int getColumnCount() {
        return colmns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        invoiceHeader invHeader = invoicesArray.get(rowIndex);
        switch (columnIndex) {
        case 0: 
            return
                    invHeader.getNum();
        case 1: 
            return 
                    invoiceFrame.dateFormat.format(invHeader.getDate());
        case 2: 
            return 
                    invHeader.getCustomer();
        case 3:
            return
                    invHeader.getItemTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int colmn) {
        return colmns[colmn];
    }
}
