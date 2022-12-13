
package sig.model;

public class invoiceLine {
    private String item;
    private double price;
    private int count;
    private invoiceHeader invHeader;

    public invoiceLine() {
    }

    public invoiceLine(String item, double price, int count, invoiceHeader header) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invHeader = header;
    }

    public invoiceHeader getHeader() {
        return invHeader;
    }

    public void setHeader(invoiceHeader header) {
        this.invHeader = header;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public double getLineTotal() {
        return price * count;
    }

    @Override
    public String toString() {
        return invHeader.getNum()+","+ item + "," + price + "," + count;
    }

    
    
}
