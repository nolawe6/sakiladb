package com.cap.sakila.sakiladatabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.sakila.sakiladatabase.hib.Address;

public interface AddressRepository extends JpaRepository<Address, Short>{

}
