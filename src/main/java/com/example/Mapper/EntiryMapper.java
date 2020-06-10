package com.example.Mapper;

import java.util.List;

import com.example.Model.FlightDetailsDTO;


public interface EntiryMapper <D ,E> {

	E convertToEntity(D d) ;
	List<E> convertToEntity(List<D> listOfD) ;
	
	D convertToDTO(E e) ;
	List<FlightDetailsDTO> convertToDTO(List<E> listOfE) ;
	
}
