package com.icbt.service;

import java.sql.SQLException;
import java.util.List;

import com.icbt.dao.CustomerDAO;
import com.icbt.model.Customer;

public class CustomerService {

    private static CustomerService instance;
    private CustomerDAO customerDAO;

    private CustomerService() {
        this.customerDAO = new CustomerDAO();
    }

    public static CustomerService getInstance() {
        if (instance == null) {
            synchronized (CustomerService.class) {
                if (instance == null) {
                    instance = new CustomerService();
                }
            }
        }
        return instance;
    }

    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    public List<Customer> getAllCustomers() throws SQLException {
        return customerDAO.getAllCustomers();
    }
}
