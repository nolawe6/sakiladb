package com.cap.sakila.sakiladatabase.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.sakila.sakiladatabase.hib.Address;
import com.cap.sakila.sakiladatabase.hib.Customer;
import com.cap.sakila.sakiladatabase.hib.Payment;
import com.cap.sakila.sakiladatabase.hib.Rental;
import com.cap.sakila.sakiladatabase.hib.Store;
import com.cap.sakila.sakiladatabase.service.SakilaService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//@RestController

//@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private SakilaService sakilaService;
	
	
	//@ApiOperation(value = "View a list of available products", response = ArrayList.class)
//	@ApiResponses(value = {
//	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
//	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
//	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
//	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
//	}
//	)
//	@RequestMapping(value = "/customers", method= RequestMethod.GET, produces = "application/json")
//	public ArrayList<Customer> getAllCustomers(){
//	    ArrayList<Customer> customers = (ArrayList<Customer>) sakilaService.getAllCustomers();
//	    return customers;
//	}
	//@ApiOperation(value = "View a list of available products", response = ArrayList.class)
	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Customer> getAllCustomers(){
        ArrayList<Customer> customers = (ArrayList<Customer>) sakilaService.getAllCustomers();
        return customers;
    }
	
	@RequestMapping(value="/update", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public Customer updateCustomer(short id, String name, String lastName) {
		Customer customer = sakilaService.getCustomerById(id);
		customer.setFirstName(name);
		customer.setLastName(lastName);
		Customer c = sakilaService.updateCustomer(customer);
		return c;
	}
	
	@RequestMapping(value="/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
	public void deleteCustomerById(@PathVariable short id) {
		sakilaService.deleteCustomer(id);
		//return c;
	}
	
	
	
}
