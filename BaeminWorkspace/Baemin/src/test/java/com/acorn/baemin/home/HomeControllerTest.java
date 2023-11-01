package com.acorn.baemin.home;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acorn.baemin.home.repository.OrderRepository;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
@Log4j
public class HomeControllerTest {

	@Autowired
	OrderRepository dao;
	
	//@Test
	public void test() {
		fail("Not yet implemented");
	}

	 
	@Test 
	public void deleteTest() throws Exception {	 
		log.info( dao.orderDelete( 70002) );
			  
	}
}
