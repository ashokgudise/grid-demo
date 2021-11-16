package com.grid.demo.controller;

import com.grid.demo.model.Customer;
import com.grid.demo.model.OperationType;
import com.grid.demo.service.CustomerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    private CustomerSerivce customerSerivce;

    @RequestMapping("/custom")
    public String custom(Model model){
        model.addAttribute("customers", this.customerSerivce.findAll());
        return "index";
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("customers", this.customerSerivce.findAll());
        return "demo";
    }

    @RequestMapping(value="/customerUpdateToEdit", method = RequestMethod.POST)
    public String customerSelectionToUpdate(@ModelAttribute(value="customer") Customer customer, Model model) {
        model.addAttribute("customer", customer);
        return "demo-update";
    }

    @PostMapping("/customerUpdate")
    public String updateStudent( @ModelAttribute(value="customer") Customer customer,
                                 Model model) {
        model.addAttribute("customers", this.customerSerivce.updateCustomer(OperationType.UPDATE, customer));
        System.out.println("Before Update");
        System.out.println("Age: \t"+customer.getAge());
        System.out.println("Customer Name: \t"+customer.getCustomerName());
        System.out.println("Address: \t"+customer.getAddress());
        System.out.println("City: \t"+customer.getCity());
        System.out.println("Country: \t"+customer.getCountry());
        System.out.println("PostalCode \t"+customer.getPostalCode());
        model.addAttribute("customers", this.customerSerivce.findAll());
        return "demo";
    }

    @PostMapping("/createCustomer")
    public String createStudent( @ModelAttribute(value="customer") Customer customer,
                                 Model model) {
        model.addAttribute("customers", this.customerSerivce.updateCustomer(OperationType.CREATE, customer));
        System.out.println("Age: \t"+customer.getAge());
        System.out.println("Customer Name: \t"+customer.getCustomerName());
        System.out.println("Address: \t"+customer.getAddress());
        System.out.println("City: \t"+customer.getCity());
        System.out.println("Country: \t"+customer.getCountry());
        System.out.println("PostalCode \t"+customer.getPostalCode());
        model.addAttribute("customers", this.customerSerivce.findAll());
        return "demo";
    }
}
