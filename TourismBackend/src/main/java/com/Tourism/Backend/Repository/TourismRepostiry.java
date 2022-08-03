package com.Tourism.Backend.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tourism.Backend.Entity.Tourism;

@Repository
public interface TourismRepostiry extends JpaRepository<Tourism, Long> {

	Optional<Tourism> findById(int i);
	
	

}
