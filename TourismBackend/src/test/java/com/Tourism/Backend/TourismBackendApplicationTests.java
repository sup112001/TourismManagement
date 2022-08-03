package com.Tourism.Backend;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Tourism.Backend.Entity.Tourism;
import com.Tourism.Backend.Repository.TourismRepostiry;

@SpringBootTest
class TourismBackendApplicationTests {
		
	
		@Autowired
		TourismRepostiry repo;
		
	
	
		@Test
		public void testTourism() {
			
				Tourism tourist = new Tourism() ;
				tourist.SetId(1009);
				tourist.setfirstName("Krishna") ;
				tourist.lastName("Chatterjee");
				tourist.numberofdays(12);
				tourist.gender("F");
				tourist.age(25);
				tourist.fromplace("Beleghata");
				repo.save(tourist);
				assertNotNull(repo.findById(1009).get());
			}
		
		@Test
		public void testReadAll() {
			List<Tourism> list = repo . findAll();
			assertThat(list).size().isGreaterThan(0);
		}



		
			
			
		}

