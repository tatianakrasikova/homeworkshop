package ait.cochort49.shop.homeworkshop.servise;

import ait.cochort49.shop.homeworkshop.model.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> getAllCustomers() {
        return List.of();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return null;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
    // Реализация методов интерфейса
}
