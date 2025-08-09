/*
 * 6. Invoice class 
 * This class represent an invoice, linking a customer to a total amount.
 * 
 * 
 * Composition Concept
 * Relationship 'has-a' (มี class Customer)
 * เช่น รถยนต์ ต้องมีเครื่องยนต์, ล้อ
 */

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount){
        if(id < 0){ 
            throw new IllegalArgumentException("Customer ID must be non-negative");
        }
        if(customer == null){
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        if(amount < 0){
            throw new IllegalArgumentException("Amount must be non-negative");
        }

        this.id = id;
        this.customer = customer;
        this.amount = amount;

    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }
    
    
    public void setCustomer(Customer customer) {
        if(customer == null){
            throw new IllegalArgumentException("customer must not be null.");
        }
        this.customer = customer;
    }

    public void setAmount(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount must be non-negative");
        }
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }
        
    public String getCustomerName(){
        return customer.getName();
    }

    // public int getCustomerDiscount(){
    //     return customer.getDiscount();
    // }
    //Core business login: apply the customer's discount policy

    //คำนวณ ยอดเงินสุดท้ายหลังหักส่วนลด
    public double getAmountAfterDiscount(){
        // //1.คำนวณหาส่วนลดจริง
        // double discountAmount = this.amount * (customer.getDiscount()/100.0);
        // //2.คำนวณหายอดเงินสุดท้ายหลังหักส่วนลด
        // return this.amount - discountAmount;

        // Function บนกับล่างเหมือนกัน
        // return this.amount * (1 - customer.getDiscount()/100.0);

        return this.customer.getDiscountPolicy().applyDiscount(this.amount);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Invoice{ " + "id= " + id + ", customerId= " + getCustomerId() + ", customerName= " +getCustomerName() + ", originalAmount= " + String.format("%.2f", amount) + ", discountAmount= " + String.format("%.2f", getAmountAfterDiscount()) + " }";
    }
}
