package com.cg.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.beans.CarDTO;
import com.cg.dao.CarDAO;

@Repository
public class JPACarDAO  implements CarDAO{
	
@PersistenceContext
private EntityManager entityManager;

@Override
public List<CarDTO> findAll() {
	
	try{
		Query query=entityManager.createQuery("select car from CarDTO car");
		return query.getResultList();
	}finally{
		entityManager.close();
	}
	
}

@Override
public CarDTO findById(int id) {
	
	CarDTO car=(CarDTO)entityManager.find(CarDTO.class,id);
	return car;
}

@Override
public void create(CarDTO car) {
	
	
	
}

@Override
public void update(CarDTO car) {

	
}

@Override
public void delete(String[] ids) {
	// TODO Auto-generated method stub
	
}




}
