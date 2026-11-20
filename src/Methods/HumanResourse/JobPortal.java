package Methods.HumanResourse;

import Methods.SalesDepartment.Invoice;

public class JobPortal extends Invoice {
    public void getJobPortalInvoice() {
        System.out.println("Job Portal Invoice");

        // protected access modifier example
        getInvoice();
    }
}
