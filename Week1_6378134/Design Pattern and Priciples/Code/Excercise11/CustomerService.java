package Excercise11;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(int id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Customer Details:");
        System.out.println("ID    : " + customer.getId());
        System.out.println("Name  : " + customer.getName());
        System.out.println("Email : " + customer.getEmail());
    }
}
