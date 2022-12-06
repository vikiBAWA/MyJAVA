package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="travel")
public class Travel {
	//variables
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="car_name")
    private String carName;
    
    @Column(name="owner_name")
    private String ownerName;

    @Column(name="number_plate")
    private String numberPlate;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="instructor_detail_id")
    private TravelDetail instructorDetail;
    
    //default constructor
    public Travel() {
        
    }

 
    //parameterized constructor
  

 
    public Travel(String carName, String ownerName, String numberPlate) {
		this.carName = carName;
		this.ownerName = ownerName;
		this.numberPlate = numberPlate;
	}


  //getter & Setter
	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String getNumberPlate() {
		return numberPlate;
	}


	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}


	public TravelDetail getInstructorDetail() {
		return instructorDetail;
	}


	public void setInstructorDetail(TravelDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}


	

    @Override
	public String toString() {
		return "Travel [id=" + id + ", carName=" + carName + ", ownerName=" + ownerName + ", numberPlate=" + numberPlate
				+ ", instructorDetail=" + instructorDetail + "]";
	}
}
