package com.cap.sakila.sakiladatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.sakila.sakiladatabase.hib.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Short> {
	//public Customer getCustomerById(short id);
}
