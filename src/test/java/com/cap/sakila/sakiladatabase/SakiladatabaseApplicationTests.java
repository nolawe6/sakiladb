package com.cap.sakila.sakiladatabase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
//import org.mockito.Mock;
//import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.cap.sakila.sakiladatabase.dao.CustomerRepository;
import com.cap.sakila.sakiladatabase.hib.Customer;
import com.cap.sakila.sakiladatabase.service.SakilaService;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SakiladatabaseApplicationTests {
	
	@Autowired
	private SakilaService sakilaService;

//	@Test
//	public void testGetAllCustomers(){
//		assertEquals(595, sakilaService.getAllCustomers().size());
//	}

}
