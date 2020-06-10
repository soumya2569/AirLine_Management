package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Airport;


@Repository
public interface DaoRepo extends JpaRepository<Airport ,Integer>{
	
	

}
