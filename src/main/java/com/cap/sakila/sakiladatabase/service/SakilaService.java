package com.cap.sakila.sakiladatabase.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.TransactionException;

import com.cap.sakila.sakiladatabase.dao.AddressRepository;
import com.cap.sakila.sakiladatabase.dao.CustomerRepository;
import com.cap.sakila.sakiladatabase.dao.SakilaDAO;
import com.cap.sakila.sakiladatabase.hib.Address;
import com.cap.sakila.sakiladatabase.hib.Customer;


@Service
@Transactional
public class SakilaService {
	
	@Autowired
	private SakilaDAO dao;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(short id) {
		//customerRepository.f
		
		Customer customer = customerRepository.getOne(id);//customerRepository.getCustomerById(id);
		return customer;
	}
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
			return customerRepository.save(customer);
	}
	
	public void deleteCustomer(short id) {
		customerRepository.deleteById(id);
	}
	
	public List<Address> getAllAddresses(){
		return addressRepository.findAll();
	}
	
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}
	
	public Address updateAddress(Address address) {
			return addressRepository.save(address);
	}
	
	public void deleteAddress(Address address) {
		addressRepository.delete(address); 
	}
	public Address getAddressById(short id) {
		//customerRepository.f
		
		Address address = addressRepository.getOne(id);//customerRepository.getCustomerById(id);
		return address;
	}
	
}
