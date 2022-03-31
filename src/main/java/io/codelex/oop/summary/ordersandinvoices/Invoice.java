package io.codelex.oop.summary.ordersandinvoices;

public class Invoice extends ItemContainer {
    private final double vat = 0.21;
    private final String invoiceNumber;
    private InvoiceStatus status = InvoiceStatus.APPROVED;

    public Invoice(Order order, String invoiceNumber) throws WrongOrderException {
        this.items = order.getItemsList();
        if (items.isEmpty()) {
            throw new WrongOrderException("Order is empty.");
        }
        this.invoiceNumber = invoiceNumber;
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    @Override
    public String toString() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("INVOICE NUMBER: ")
               .append(invoiceNumber).append("\n")
               .append("STATUS: ")
               .append(status.name()).append("\n");
        for (int i = 0; i < items.size(); i++) {
            invoice.append(i + 1 + ". " + items.get(i) + "\n");
        }
        invoice.append("SUM: ")
               .append(getSum()).append("\n")
               .append("VAT (").append(vat * 100).append("): ")
               .append(getSum() * vat).append(" EUR\n")
               .append("TOTAL: ").append(getSum() + getSum() * vat).append(" EUR");
        return invoice.toString();
    }

}

//===================================================
//= INVOICE NUMBER: INV123                          =
//= STATUS: APPROVED                                =
//= 1. Milk, 0.75 EUR, best before: 01.04.2022      =
//= 2. Radio, 25.00 EUR, power: 100W                =
//= 3. Bucket, 5.00 EUR, color: red                 =
//= SUM: 30.75 EUR                                  =
//= VAT (21%): 6.46 EUR                             =
//= TOTAL: 37.21 EUR                                =
//===================================================
