public class Customer {

    public Customer(String customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }

    public Customer(String customerId,String customerName,String customerAddress, String customerPhone){
        this.customerAddress=customerAddress;
        this.customerPhone=customerPhone;
        this.customerId=customerId;
        this.customerName=customerName;
    }

    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;


    public String getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
