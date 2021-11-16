package com.grid.demo.service;

import com.grid.demo.model.Customer;
import com.grid.demo.model.OperationType;
import com.grid.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerSerivce {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return Streamable.of(this.customerRepository.findAll()).toList();
    }

    public Customer findCustomerById(Long customerId){
         Optional<Customer> customerOptional = this.customerRepository.findById(customerId);
         if(customerOptional.isPresent()){
             return customerOptional.get();
         }{
             Customer newCustomer = new Customer();
             return newCustomer;
        }
    }

    public Customer updateCustomer(final OperationType operationType, final Customer customer){

        Optional<Customer> customerOptional = this.customerRepository.findById(customer.getCustomerId());
        if(operationType.equals(OperationType.CREATE)){
            Customer customerNew =  new Customer();
            customerNew.setCustomerName(customer.getCustomerName());
            customerNew.setAddress(customer.getAddress());
            customerNew.setAge(customer.getAge());
            customerNew.setCity(customer.getCity());
            customerNew.setCountry(customer.getCountry());
            customerNew.setContactName(customer.getContactName());
            customerNew.setSex(customer.getSex());
            customerNew.setPostalCode(customer.getPostalCode());
            return this.customerRepository.save(customerNew);
        }else{
            if(customerOptional.isPresent()){
                Customer customer1 =  customerOptional.get();
                customer1.setCustomerName(customer.getCustomerName());
                customer1.setAddress(customer.getAddress());
                customer1.setAge(customer.getAge());
                customer1.setCity(customer.getCity());
                customer1.setCountry(customer.getCountry());
                customer1.setContactName(customer.getContactName());
                customer1.setSex(customer.getSex());
                customer1.setPostalCode(customer.getPostalCode());
                return this.customerRepository.save(customer1);
            }else{
                //Throw Exception
            }
        }
        return customer;
    }
}
