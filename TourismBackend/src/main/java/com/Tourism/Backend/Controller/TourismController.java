package com.Tourism.Backend.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tourism.Backend.Entity.Tourism;
import com.Tourism.Backend.Exception.ResourceNotFoundException;
import com.Tourism.Backend.Repository.TourismRepostiry;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class TourismController {
	
	@Autowired
	private TourismRepostiry tourismrepository;
	
	@GetMapping("/tourists")
	public List<Tourism> getAllTourism(){
		return tourismrepository.findAll();
	}
	@PostMapping("/tourists")
	public Tourism createTourists(@RequestBody Tourism tourist) {
		return tourismrepository .save(tourist);
	}
	
	@GetMapping("/tourists/{id}")
	public ResponseEntity<Tourism> getTourismById(@PathVariable Long id) {
		Tourism tourist = tourismrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Tourism not Exixt with id :"+ id));
		return ResponseEntity.ok(tourist);
		
	}
	@PutMapping("/tourists/{id}")
	public ResponseEntity<Tourism> updateTourism(@PathVariable Long id, @RequestBody Tourism touristDetails) {
		Tourism tourist = tourismrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Tourism not Exixt with id :"+ id));
		
		
		tourist.setId(touristDetails.getId());
		tourist.setFirstName(touristDetails.getFirstName());
		tourist.setLastName(touristDetails.getLastName());
		tourist.setNumberofdays(touristDetails.getNumberofdays());
		tourist.setGender(touristDetails.getGender());
		tourist. setAge(touristDetails.getAge());
		tourist. setFromPlace(touristDetails.getFromPlace());
		
		Tourism updatedTourism = tourismrepository.save(tourist);
		return ResponseEntity.ok(updatedTourism);
	}	
	@DeleteMapping("/tourists/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteTourism(@PathVariable Long id) {
		Tourism tourist = tourismrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Tourism not Exixt with id :"+ id));
		
		tourismrepository.delete(tourist);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	
	
	
		
	}
	
	
}
