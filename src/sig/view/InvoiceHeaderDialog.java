package sig.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvoiceHeaderDialog extends JDialog {
    
    private final JButton _save;
    private final JButton _cancel;
    private final JTextField _nameF;
    private final JTextField _date;
    private final JLabel _nameL;
    private final JLabel _dateL;
    
    
    public InvoiceHeaderDialog(invoiceFrame frame) {
        _nameL = new JLabel("Customer Name:");
        _nameF = new JTextField(20);
        _dateL = new JLabel(" Date:");
        _date = new JTextField(20);
        _save = new JButton("Save");
        _cancel = new JButton("Cancel");
        
        _save.setActionCommand("newInvoiceSave");
        _cancel.setActionCommand("newInvoiceCancel");
        
        _save.addActionListener(frame.getActionHandler());
        _cancel.addActionListener(frame.getActionHandler());
        setLayout(new GridLayout(3, 2));
        
        add(_dateL);
        add(_date);
        add(_nameL);
        add(_nameF);
        add(_save);
        add(_cancel);
        
        pack();
        
    }
    
    public JTextField getCustNameField() {
        return _nameF;
    }

    public JTextField getDateField() {
        return _date;
    }
    
}
