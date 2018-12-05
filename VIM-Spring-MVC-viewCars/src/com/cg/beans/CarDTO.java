package com.cg.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//PLEASE UPDATE THIS IMPLEMENTATION (REFER TODOS)
/**
 * 
 * This is a CarDTO class
 * @see java.lang.Object
 * @author Abhishek
 * 
 *
 */
@Entity
@Table(name="car")
public class CarDTO implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
    private String make;
    private String model;
    @Column(name="model_year")
    private String modelYear;

    public CarDTO()
    {
        //TODO 1 initialize id to -1 and rest of the member variables to a blank string
		id = -1;
		make = model = modelYear = "Not Specified";
    }

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
}