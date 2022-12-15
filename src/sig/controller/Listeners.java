
package sig.controller;
    
import sig.model.invoiceHeader;
import sig.model.invoiceLine;
import sig.model.Lines;
import sig.view.invoiceFrame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Listeners implements ListSelectionListener {

    private  invoiceFrame frame;

    public Listeners(invoiceFrame frame) {
        this.frame = frame;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedInvIndex = frame.getheaderTable().getSelectedRow();
        System.out.println("Invoice selected: " + selectedInvIndex);
        if (selectedInvIndex != -1) {
            invoiceHeader selectedInv = frame.getInvoicesArray().get(selectedInvIndex);
            ArrayList<invoiceLine> lines = selectedInv.getLines();
            Lines lineTable = new Lines(lines);
            frame.setLinesArray(lines);
            frame.getlineTable().setModel(lineTable);
            frame.getCustNameLbl().setText(selectedInv.getCustomer());
            frame.getInvNumLbl().setText("" + selectedInv.getNum());
            frame.getInvTotalIbl().setText("" + selectedInv.getItemTotal());
            frame.getDateLbl().setText(invoiceFrame.dateFormat.format(selectedInv.getDate()));
        }
    }

}

    

