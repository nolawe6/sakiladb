//package com.cap.sakila.sakiladatabase.controller;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.cap.sakila.sakiladatabase.dao.SakilaDAO;
//import com.cap.sakila.sakiladatabase.hib.Address;
//import com.cap.sakila.sakiladatabase.hib.Customer;
//import com.cap.sakila.sakiladatabase.service.SakilaService;
//
//@Controller
//public class SakilaController {
//	
//	@Autowired
//	private SakilaService sakilaService;
//	
//	
//	@RequestMapping("/customers")
//	public String getAllCustomers(Model model) {
//		model.addAttribute("customers", sakilaService.getAllCustomers());
//		return "customers";
//	}
//	
//	@RequestMapping("/delete/{id}")
//	public String delete(@PathVariable short id, Model model) {
//		sakilaService.deleteCustomer(id);
//		model.addAttribute("customers", sakilaService.getAllCustomers());
//		return "customers";
//	}
//	
//	@RequestMapping("/update/{id}")
//	public String update(@PathVariable short id, Model model) {
//		Customer c = sakilaService.getCustomerById(id);
//		model.addAttribute("customer", c);
//		//sakilaService.deleteCustomer(id);
//		return "update";
//	}
//	
//	@RequestMapping(value="/customers", method = RequestMethod.POST)
//	public String updatePost(Customer customer, Model model, String addressId, String phone) {
//		//System.out.println("Name1 "+customer.getFirstName());
//		Customer c = sakilaService.getCustomerById(customer.getCustomerId());
//		c.setFirstName(customer.getFirstName());
//		c.setLastName(customer.getLastName());
//		Address address = sakilaService.getAddressById(Short.parseShort(addressId));
//		address.setPhone(phone);
//		c.setAddress(address);
//		sakilaService.updateCustomer(c);
//		model.addAttribute("customers", sakilaService.getAllCustomers());
//		//sakilaService.deleteCustomer(id);
//		return "customers";
//	}
//	
//	
//	
//	@Autowired
//	private SakilaDAO dao;
//	
//	@RequestMapping("/hello")
//	public String sayHello() {
//		dao.getStaff((byte)1);
//		return "hel";
//	}
//	
//} 
