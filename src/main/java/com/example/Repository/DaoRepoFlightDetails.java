package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.FlightDetails;


@Repository
public interface DaoRepoFlightDetails  extends JpaRepository<FlightDetails ,Integer>{

}
