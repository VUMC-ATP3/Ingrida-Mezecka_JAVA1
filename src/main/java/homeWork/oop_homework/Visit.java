package homeWork.oop_homework;


import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    private double totalExpense;




    public Visit(String name, Date date){
        this.customer = customer;
        this.date = date;
        };

    public Customer getCustomer() {
        return customer;
    };

    public double getServiceExpense(double v) {
        return serviceExpense;
    };

    public double getProductExpense(double v) {
        return productExpense;
    };

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    };

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ", totalExpense=" + totalExpense +
                '}';
    }
}
