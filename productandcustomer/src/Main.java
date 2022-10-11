public class Main {
    public static void main(String[] args) {

        Product   product = new Product("25A","Asus");
        System.out.println(product.getItemNumber());

        Customer customer = new Customer("2510","Ali faruk","Istanbul,Turkey",
                "05550000000");

        System.out.println(customer.getCustomerId());




    }
}