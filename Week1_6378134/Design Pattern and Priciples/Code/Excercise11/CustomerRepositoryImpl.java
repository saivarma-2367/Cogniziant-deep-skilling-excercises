package Excercise11;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "Sai Varma", "sai@example.com");
    }
}