package com.Tourism.Backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tourists")
public class Tourism {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name ="number_of_days")
	private int Numberofdays;
	
	@Column(name = "gender")
	private String Gender;
	
	@Column(name = "age")
	private String Age;
	
	@Column(name = "fromplace")
	private String FromPlace;
	 
	public Tourism() {
		
	}

	public Tourism(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumberofdays() {
		return Numberofdays;
	}

	public void setNumberofdays(int numberofdays) {
		Numberofdays = numberofdays;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getFromPlace() {
		return FromPlace;
	}

	public void setFromPlace(String fromPlace) {
		FromPlace = fromPlace;
	}

	public void SetId(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setfirstName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void lastName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void numberofdays( String string) {
		// TODO Auto-generated method stub
		
	}

	public void gender(String string) {
		// TODO Auto-generated method stub
		
	}

	public void age(String string) {
		// TODO Auto-generated method stub
		
	}

	public void fromplace(String string) {
		// TODO Auto-generated method stub
		
	}

	public void numberofdays(int i) {
		// TODO Auto-generated method stub
		
	}

	public void age(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
