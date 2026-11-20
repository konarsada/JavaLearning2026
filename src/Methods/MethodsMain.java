package Methods;

import Methods.HumanResourse.JobPortal;
import Methods.SalesDepartment.Order;

public class MethodsMain {
    public static void main(String[] args) {
        Order order = new Order();
        order.getOrder();

        JobPortal jp = new JobPortal();
        jp.getJobPortalInvoice();

        order.overLoadingEx(10);
        order.overLoadingEx(Integer.valueOf(10));
        Integer i = 20;
        order.overLoadingEx(i);
    }
}
