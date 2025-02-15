package com.icbt.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.icbt.model.Customer;

public class CustomerDAO {

    // Adding a new customer
    public void addCustomer(Customer customer) {
        String query = "INSERT INTO Customer (name, email, address, phonenumber, nic) VALUES (?, ?, ?, ?, ?)";
        Connection connection=null;
        PreparedStatement statement = null;
        
        try  {
        	connection = DBConnectionFactory.getConnection();
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getAddress());
            statement.setString(4, customer.getPhonenumber());  
            statement.setString(5, customer.getNic());  
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    
    
    finally
    {
    	try {
			statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
    }


    // Retrieving all customers
    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        String query = "SELECT * FROM Customer";

        Connection connection = DBConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) 
        {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phonenumber = resultSet.getString("phonenumber");  
                String nic = resultSet.getString("nic"); 
                customers.add(new Customer(id, name, email, address, phonenumber, nic));
            }
        
             resultSet.close();
             statement.close();
             return customers;
    }
}
