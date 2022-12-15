
package sig.view;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

    public class LineDialog extends JDialog{
    private final JTextField _nameF;
    private final JTextField _countF;
    private final JTextField _priceF;
    private final JLabel _nameL;
    private final JLabel _countL;
    private final JLabel _priceL;
    private JButton _save;
    private JButton _cancel;
    
    public LineDialog(invoiceFrame frame) {
        _nameF = new JTextField(20);
        _nameL = new JLabel("Item Name");
        
        _countF = new JTextField(20);
        _countL = new JLabel("Item Count");
        
        _priceF = new JTextField(20);
        _priceL = new JLabel("Item Price");
        
        _save = new JButton("Save");
         _cancel = new JButton("Cancel");
        
        _save.setActionCommand("newLineSave");
        _cancel.setActionCommand("newLineCancel");
        
        _save.addActionListener(frame.getActionHandler());
        _cancel.addActionListener(frame.getActionHandler());
        setLayout(new GridLayout(4, 2));
        
        add(_nameL);
        add(_nameF);
        add(_countL);
        add(_countF);
        add(_priceL);
        add(_priceF);
        add(_save);
        add(_cancel);
        
        pack();
    }

    public JTextField getItemNameField() {
        return _nameF;
    }

    public JTextField getItemCountField() {
        return _countF;
    }

    public JTextField getItemPriceField() {
        return _priceF;
    }
}

    

