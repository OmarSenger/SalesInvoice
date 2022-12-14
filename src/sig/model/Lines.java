package sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Lines extends AbstractTableModel {

    private ArrayList<invoiceLine> linesArray;
    private String[] columns = {"Item Name", "Unit Price", "Count", "Line Total"};

    public Lines(ArrayList<invoiceLine> linesArray) {
        this.linesArray = linesArray;
    }

    @Override
    public int getRowCount() {
        return linesArray == null ? 0 : linesArray.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (linesArray == null) {
            return "";
        } else {
            invoiceLine invline = linesArray.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return invline.getItem();
                case 1:
                    return invline.getPrice();
                case 2:
                    return invline.getCount();
                case 3:
                    return invline.getLineTotal();
                default:
                    return "";
            }
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

}


