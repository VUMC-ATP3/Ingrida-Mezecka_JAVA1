package homeWork.oop_homework;

import java.sql.Date;
import java.util.zip.DataFormatException;

public class Example {
    public static void main(String[] args) {

        Customer customer = new Customer("Anna");
        customer.setMember(true);
        customer.isMember();
        customer.setMemberType("Gold");
        System.out.println(customer.toString());


        Visit customerTwo = new Visit("Peteris", new Date());
        customerTwo.getCustomer();
        customerTwo.getServiceExpense(45.78);
        customerTwo.getProductExpense(100.06);
        System.out.println(customerTwo.toString());



        




    }

    // atlaides tiai uz pakalpojumiem




}
