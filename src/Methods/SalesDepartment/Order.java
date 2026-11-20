package Methods.SalesDepartment;

public class Order {
    public void getOrder() {
        System.out.println("Order");

        // protected access modifier example
        Invoice invoice = new Invoice();
        invoice.getInvoice();
    }

    // Overloading
    public void overLoadingEx(int x) {
        System.out.println("overLoading1 called");
    }

    public void overLoadingEx(Integer x) {
        System.out.println("overLoading2 called");
    }
}
